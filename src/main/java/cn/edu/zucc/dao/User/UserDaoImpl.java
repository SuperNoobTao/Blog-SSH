package cn.edu.zucc.dao.User;

import cn.edu.zucc.common.CommonDAO;
import cn.edu.zucc.model.UsertableBean;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Intercepter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public class UserDaoImpl extends CommonDAO<UsertableBean,Integer> implements  UserDao{



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
