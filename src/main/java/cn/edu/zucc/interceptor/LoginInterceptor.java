package cn.edu.zucc.interceptor;


import cn.edu.zucc.action.UserAction;
import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.util.ConfigUtils;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**管理界面登陆检测拦截器
 * Created by shentao on 2016/5/17 0017.
 */
public class LoginInterceptor extends AbstractInterceptor {

    public static final String LOGIN_TAG = "user";
    public static final String LOGIN_PAGE = "login";

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("进入拦截器");

        //检查是否是登录页面的Action
        if(actionInvocation.getAction() instanceof UserAction){
            //判断是否是登录相关的Method
            if(actionInvocation.getProxy().getMethod().equals("login")||
                    actionInvocation.getProxy().getMethod().equals("loginui"))
                return actionInvocation.invoke();
            //判断注册功能是否开启，并且执行Method是否是注册相关方法
            else if(ConfigUtils.getProperty("register").equals("true")
                    && (actionInvocation.getProxy().getMethod().equals("register")||
                    actionInvocation.getProxy().getMethod().equals("registerui"))){
                return actionInvocation.invoke();
            }else
                return LOGIN_PAGE;
        }

        Map session = actionInvocation.getInvocationContext().getSession();
        //检查是否已登录
        TbUserEntity user = (TbUserEntity) session.get(LOGIN_TAG);

        if(user==null){
            //未登录，跳转到登录页面
            return LOGIN_PAGE;
        }
        //已登录，继续执行
        return actionInvocation.invoke();
    }
}
