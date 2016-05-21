package cn.edu.zucc.service;

import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.dao.User.UserDaoImpl;
import cn.edu.zucc.model.UsertableBean;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public class UserServiceImpl implements UserService{
        UserDao  userDao =new UserDaoImpl();


    public UsertableBean login(String userid, String pwd) {
        return userDao.login(userid,pwd);
    }
}
