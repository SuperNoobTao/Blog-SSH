package cn.edu.zucc.service.User;

import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.TbUserEntity;

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
    public TbUserEntity findById(Integer id) {
        return getUserDao().findById(id);
    }

    @Override
    public List<TbUserEntity> findByqQuery(String hql) {
        return getUserDao().findByqQuery(hql);
    }

    @Override
    public List<TbUserEntity> findAll() {
        return getUserDao().findAll();
    }

    @Override
    public List<TbUserEntity> queryForPage(String hql, int offset, int length) {
        return getUserDao().queryForPage(hql,offset,length);
    }


    @Override
    public int register(TbUserEntity usertableBean) throws Exception {
        String uAcount = usertableBean.getUserAcount();
        System.out.println("studentNumber="+uAcount);
        List list = getUserDao().findByqQuery("from TbUserEntity where userAcount='"+uAcount+"'");
        if(list.isEmpty()){
        getUserDao().update(usertableBean);
        System.out.println("自动生成的主键ID"+usertableBean.getUserId());
            return 1;
        }
        else
            return -1;

    }

    @Override
    public void delete(TbUserEntity tbUserEntity) throws Exception {
        getUserDao().delete(tbUserEntity);
    }

    @Override
    public void update(TbUserEntity tbUserEntity) throws Exception {
        getUserDao().update(tbUserEntity);
    }

    @Override
    public TbUserEntity login(String uAcount, String uPwd) throws Exception {
        return getUserDao().login(uAcount,uPwd);
    }


}
