package cn.edu.zucc.dao.User;

import cn.edu.zucc.model.UsertableBean;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface UserDao {
    public void save(UsertableBean usertableBean) throws Exception;
    public void delete(UsertableBean usertableBean) throws Exception;
    public void update(UsertableBean usertableBean) throws Exception;
    public UsertableBean login(String username, String password) throws Exception;
    public int updateByQuery(String hql);
    public UsertableBean findById(Integer id);
    public List<UsertableBean> findByqQuery(String hql);
    public List<UsertableBean> findAll();
    public  List<UsertableBean> queryForPage(String hql, int offset,int length);











}
