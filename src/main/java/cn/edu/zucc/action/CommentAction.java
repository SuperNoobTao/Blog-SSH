package cn.edu.zucc.action;

import cn.edu.zucc.model.TbCommentEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Date;

/**
 * Created by st on 2016/6/11.
 */
public class CommentAction extends ActionSupport {
    private TbCommentEntity tbCommentEntity = new TbCommentEntity();
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }


    //提供访客留言界面
    public String commentUI(){

        return SUCCESS;
    }

    //访客留言操作
    public String comment(){

        return SUCCESS;
    }




}
