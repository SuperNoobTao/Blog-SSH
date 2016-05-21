package cn.edu.zucc.dao.User;

import cn.edu.zucc.model.UsertableBean;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface UserDao {
    public List<UsertableBean> getList();
    public int add(UsertableBean fileupdownBean);
    public int delete(UsertableBean fileupdownBean);
    public int update(UsertableBean fileupdownBean);
    public UsertableBean getById(Integer id);

}
