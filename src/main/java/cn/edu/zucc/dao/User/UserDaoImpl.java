package cn.edu.zucc.dao.User;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.UsertableBean;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public class UserDaoImpl extends CommonDaoImpl<UsertableBean> implements  UserDao{





    @Override
    public UsertableBean login(String username, String password) {
        try {
            String hql ="from UsertableBean where studentNumber=? and password=?";
            Session session = getSessionFactory().getCurrentSession();
            Query query = session.createQuery(hql);
            query.setString(0,username);
            query.setString(1,password);
            return (UsertableBean) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
