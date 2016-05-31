package cn.edu.zucc.action;

import cn.edu.zucc.model.UsertableBean;
import cn.edu.zucc.service.User.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

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
            return SUCCESS;
        }
        return ERROR;
    }


    public  String register() throws Exception{
        String studentNumber = this.getUsertableBean().getStudentNumber();
        String pwd = this.getUsertableBean().getPassword();
        String email = this.getUsertableBean().getEmail();
        String cell_phone = this.getUsertableBean().getCellPhone();


        UsertableBean user = new UsertableBean();
        user.setStudentNumber(studentNumber);
        user.setPassword(pwd);
        user.setEmail(email);
        user.setCellPhone(cell_phone);
        System.out.println("studentNumber=" + studentNumber);
        System.out.println("pwd=" + pwd);
        System.out.println("email=" + email);
        System.out.println("cell_phone=" + cell_phone);

        int i = getUserService().register(user);
        System.out.println("i="+i);
        if(i==1){
            return SUCCESS;
        }

       return ERROR;

    }



}
