package cn.edu.zucc.dao.User;

import cn.edu.zucc.model.UsertableBean;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface UserDao {
    public List<UsertableBean> getList();
    public void save(UsertableBean usertableBean);
    public void delete(UsertableBean usertableBean);
    public void update(UsertableBean usertableBean);
    public UsertableBean getById(Integer id);
    public List<UsertableBean> findByqQuery(String hql);
    public UsertableBean login(String username, String password);

}
