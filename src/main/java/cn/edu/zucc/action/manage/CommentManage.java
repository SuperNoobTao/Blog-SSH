package cn.edu.zucc.action.manage;

import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.VCommentEntity;
import cn.edu.zucc.service.Visitor.VisitorService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/6/12.
 */
public class CommentManage extends ActionSupport {
    private VisitorService visitorService ;
    private String pagenum;
    private String method;



    public VisitorService getVisitorService() {
        return visitorService;
    }
    public void setVisitorService(VisitorService visitorService) {
        this.visitorService = visitorService;
    }
    public String getPagenum() {
        return pagenum;
    }
    public void setPagenum(String pagenum) {
        this.pagenum = pagenum;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }









    //分页查询留言界面
    public String query() throws SQLException {
        //分页查询所有留言
        String url = ServletActionContext.getRequest().getContextPath() + "/comment.action";
        Page<VCommentEntity> page = visitorService.findComments(pagenum,url);
        ServletActionContext.getRequest().setAttribute("page", page);
        return "query";
    }

    //默认情况下，查询列表
    @Override
    public String execute() throws Exception {
        return query();
    }
}
