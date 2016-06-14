package cn.edu.zucc.action;

import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.service.User.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by shentao on 2016/5/22.
 */
public class UserAction extends ActionSupport{
    private UserService userService;
    private TbUserEntity usertableBean;
    private String method;

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
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }

    //表单校验
    @Override
    public void validate() {
        if (method == null)
            return;
        else if (method.equals("add") || method.equals("update")||method.equals("register")) {
            if (usertableBean.getUserAcount() == null || usertableBean.getUserAcount().trim().equals(""))
                this.addFieldError("uname", "用户名不能为空哦");
            if (usertableBean.getUserPwd() == null || usertableBean.getUserPwd().trim().equals(""))
                this.addFieldError("password", "密码不能为空哦");
            else {
                if (!usertableBean.getUserPwd().matches("[0-9a-zA-Z]{8,16}"))
                    this.addFieldError("password", "密码必须是8~16位数字大小写字母");
            }

            //数据回显
            if(this.getFieldErrors().size()>0) {
                TbUserEntity user = new TbUserEntity();
                user.setUserAcount(usertableBean.getUserAcount());
                HttpServletRequest request = ServletActionContext.getRequest();
                request.setAttribute("user", user);
                request.setAttribute("method",method);
                if(method.equals("add"))
                    request.setAttribute("pageTitle", "添加用户");
                else
                    request.setAttribute("pageTitle", "修改用户");
            }
        } else if(method.equals("login")){
            if(usertableBean.getUserAcount()==null||usertableBean.getUserAcount().trim().equals(""))
                this.addFieldError("uname","账号不能为空");
            if(usertableBean.getUserPwd()==null||usertableBean.getUserPwd().trim().equals(""))
                this.addFieldError("password","密码不能为空");
        }
        else if (method.equals("delete")) {

        }
    }


    //登录
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

    //注册
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

        int i = getUserService().register(user);
        System.out.println("i="+i);
        if(i==1){
            return "r_success";
        }
       return "r_error";
    }


    //登陆界面
    public String loginui(){
        return "login";
    }

    //注册界面
    public String registerui(){
        return "register";
    }

    //注销
    public String quit() {
        System.out.println("LoginAction - quit");
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.removeAttribute("user");
        return "q_success";
    }




}
