package cn.edu.zucc.dao.User;

import cn.edu.zucc.common.CommonDAO;
import cn.edu.zucc.model.UsertableBean;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Intercepter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public class UserDaoImpl extends CommonDAO<UsertableBean,Integer> implements  UserDao{

    private SessionFactory sessionFactory;//加载数据库连接（使用spring实现加载）
    //sessionFactory的get和set方法。
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<UsertableBean> getList() {
        return null;
    }

    public void save(UsertableBean usertableBean) {

    }

    public void delete(UsertableBean usertableBean) {

    }

    public void update(UsertableBean usertableBean) {

    }

    public UsertableBean getById(Integer id) {
        return null;
    }

    public UsertableBean login(String username, String password) {
        try {
            return (UsertableBean) sessionFactory.getCurrentSession().createQuery("from UsertableBean where studentNumber=:username and password=:pwd")
                    .setString("username", username)
                    .setString("pwd",password)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
