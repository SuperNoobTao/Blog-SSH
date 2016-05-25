package cn.edu.zucc.service.User;

import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.UsertableBean;

import java.util.List;

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


    @Override
    public int updateByQuery(String hql) {
        return getUserDao().updateByQuery(hql);
    }

    @Override
    public UsertableBean findById(Integer id) {
        return getUserDao().findById(id);
    }

    @Override
    public List<UsertableBean> findByqQuery(String hql) {
        return getUserDao().findByqQuery(hql);
    }

    @Override
    public List<UsertableBean> findAll() {
        return getUserDao().findAll();
    }

    @Override
    public List<UsertableBean> queryForPage(String hql, int offset, int length) {
        return getUserDao().queryForPage(hql,offset,length);
    }


    @Override
    public int register(UsertableBean usertableBean) throws Exception {
        String studentNumber = usertableBean.getStudentNumber();
        List list = getUserDao().findByqQuery("from UsertableBean where studentNumber='"+studentNumber+"'");
        if(list == null){
        getUserDao().save(usertableBean);
            return 1;
        }
            return -1;

    }

    @Override
    public void delete(UsertableBean usertableBean) throws Exception {
        getUserDao().delete(usertableBean);
    }

    @Override
    public void update(UsertableBean usertableBean) throws Exception {
        getUserDao().update(usertableBean);
    }

    @Override
    public UsertableBean login(String username, String password) throws Exception {
        return getUserDao().login(username,password);
    }


}
