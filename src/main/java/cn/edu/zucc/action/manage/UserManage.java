package cn.edu.zucc.action.manage;

import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.service.User.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.ui.Model;

/**
 * Created by shentao on 2016/5/22.
 */
public class UserManage extends ActionSupport{
    private UserService userService;
    private TbUserEntity usertableBean;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public TbUserEntity getUsertableBean() {
        return usertableBean;
    }

    public void setUsertableBean(TbUserEntity usertableBean) {
        this.usertableBean = usertableBean;
    }



    public String login() throws Exception {
        String studentNumber = this.getUsertableBean().getUserAcount();
        String pwd = this.getUsertableBean().getUserPwd();
        System.out.println("username=" + studentNumber);
        System.out.println("pwd=" + pwd);
        getUserService().getUserList();
        usertableBean = getUserService().login(studentNumber,pwd);
        if (usertableBean!=null) {
            ActionContext.getContext().getSession().put("user", usertableBean);
            System.out.println(usertableBean);
            return SUCCESS;
        }
        return ERROR;
    }


    public  String register() throws Exception{
        String studentNumber = this.getUsertableBean().getUserAcount();
        String pwd = this.getUsertableBean().getUserPwd();
        String email = this.getUsertableBean().getUserEmail();
        String cell_phone = this.getUsertableBean().getUserPhone();


        TbUserEntity user = new TbUserEntity();
        user.setUserAcount(studentNumber);
        user.setUserPwd(pwd);
        user.setUserEmail(email);
        user.setUserPwd(cell_phone);
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
