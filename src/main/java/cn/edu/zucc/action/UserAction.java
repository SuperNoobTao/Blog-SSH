package cn.edu.zucc.action;

import cn.edu.zucc.model.UsertableBean;
import cn.edu.zucc.service.User.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by shentao on 2016/5/22.
 */
public class UserAction extends ActionSupport{
    private UserService userService;
    private UsertableBean usertableBean;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UsertableBean getUsertableBean() {
        return usertableBean;
    }

    public void setUsertableBean(UsertableBean usertableBean) {
        this.usertableBean = usertableBean;
    }



    public String login() throws Exception {
        String studentNumber = this.getUsertableBean().getStudentNumber();
        String pwd = this.getUsertableBean().getPassword();
        System.out.println("username=" + studentNumber);
        System.out.println("pwd=" + pwd);
        usertableBean = getUserService().login(studentNumber,pwd);

        if (usertableBean!=null) {
            ActionContext.getContext().getSession().put("username",
                    this.getUsertableBean().getStudentName());
            return "success";
        }
        return  "error";
    }



}
