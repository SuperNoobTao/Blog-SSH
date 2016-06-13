package cn.edu.zucc.action;

import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.TbGuestEntity;
import cn.edu.zucc.model.VCommentEntity;
import cn.edu.zucc.service.Visitor.VisitorService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by st on 2016/6/11.
 */
public class CommentAction extends ActionSupport {
    public TbCommentEntity getTbCommentEntity() {
        return tbCommentEntity;
    }

    public void setTbCommentEntity(TbCommentEntity tbCommentEntity) {
        this.tbCommentEntity = tbCommentEntity;
    }

    public VCommentEntity getvCommentEntity() {
        return vCommentEntity;
    }

    public void setvCommentEntity(VCommentEntity vCommentEntity) {
        this.vCommentEntity = vCommentEntity;
    }

    private TbCommentEntity tbCommentEntity = new TbCommentEntity();
    private VCommentEntity vCommentEntity ;
    private VisitorService visitorService ;


    public VisitorService getVisitorService() {
        return visitorService;
    }
    public void setVisitorService(VisitorService visitorService) {
        this.visitorService = visitorService;
    }


    private String title;
    private String artid;
    private String nickname;
    private String email;
    private String comcontent;
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    private String pagenum;

    public String getPagenum() {
        return pagenum;
    }

    public void setPagenum(String pagenum) {
        this.pagenum = pagenum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtid() {
        return artid;
    }

    public void setArtid(String artid) {
        this.artid = artid;
    }


    @Override
    public void validate() {
        if(method.equals("commentUI")) {
            //在artid不是数字的情况下title没意义，赋值空
            try {
                if (artid == null || artid.trim().equals(""))
                    title = null;
                else
                    Integer.parseInt(artid);
            } catch (Exception e) {
                title = null;
            }
        }else if(method.equals("comment")){
            if(nickname==null||nickname.trim().equals(""))
                this.addFieldError("nickname","昵称不能为空哦！");
            if(email==null||email.trim().equals(""))
                this.addFieldError("email","Email不能为空哦！");
            else{
                if(!email.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))
                    this.addFieldError("email","Email格式不合法！");
            }
            if(comcontent==null||comcontent.trim().equals(""))
                this.addFieldError("comcontent","留言内容不能为空哦！");

            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("nickname",nickname);
            request.setAttribute("email",email);
            request.setAttribute("comcontent",comcontent);
            request.setAttribute("title",title);
            request.setAttribute("artid",artid);
        }
    }





    //提供访客留言界面
    public String commentUI() throws SQLException {
        System.out.println("进入commentaction");
        String url = ServletActionContext.getRequest().getContextPath()+"/commentUI.action";
        Page<VCommentEntity> page = visitorService.findComments(pagenum,url);

        //把用户的邮箱隐藏起来，安全作用，尊重用户
        for(VCommentEntity comment:page.getList()){
            String email = comment.getGuestEmail().substring(0,2)+"******"+comment.getGuestEmail().substring(comment.getGuestEmail().lastIndexOf("@")-1);
            comment.setGuestEmail(email);
            System.out.println(email);
        }
        ServletActionContext.getRequest().setAttribute("page", page);
        return SUCCESS;
    }

    //访客留言操作
    public String comment() throws Exception {
        Timestamp now = new Timestamp(System.currentTimeMillis());

        TbGuestEntity guest = new TbGuestEntity();
        guest.setGuestEmail(email);
        guest.setGuestName(nickname);
        System.out.println(email+","+nickname);
        //添加访客记录
        long gid = visitorService.addGuest(guest);

        TbCommentEntity comment  = new TbCommentEntity();
        comment.setCommetContent(comcontent);
        if (artid == null || artid.equals("")) {
            artid = String.valueOf(0);
        }
        comment.setCommetCdate(now);
        comment.setArticleId(Integer.parseInt(artid));
        comment.setGuestId((int) gid);

        //添加留言记录
        visitorService.addComment(guest,comment,ServletActionContext.getRequest().getContextPath());

        //返回更新后的留言信息
        String url = ServletActionContext.getRequest().getContextPath()+"/commentUI.action";
        Page<VCommentEntity> page = visitorService.findComments(pagenum,url);
        ServletActionContext.getRequest().setAttribute("page", page);
        return SUCCESS;
    }




}
