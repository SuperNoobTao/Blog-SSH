package cn.edu.zucc.service.User;

import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.UsertableBean;

/**
 * Created by shentao on 2016/5/21.
 */

public class UserServiceImpl implements UserService{


    private UserDao  userDao;

    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    public UsertableBean login(String userid, String pwd) {
        return getUserDao().login(userid,pwd);
    }
}
