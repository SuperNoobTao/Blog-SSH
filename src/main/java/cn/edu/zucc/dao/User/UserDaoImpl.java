package cn.edu.zucc.dao.User;

import cn.edu.zucc.dao.common.CommonDaoImpl;
import cn.edu.zucc.model.TbUserEntity;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by shentao on 2016/5/21.
 */
public class UserDaoImpl extends CommonDaoImpl<TbUserEntity> implements  UserDao{





    @Override
    public TbUserEntity login(String uAcount, String uPwd) {
        try {
            String hql ="from TbUserEntity where userAcount=? and userPwd=?";
            Session session = getSessionFactory().getCurrentSession();
            Query query = session.createQuery(hql);
            query.setString(0,uAcount);
            query.setString(1,uPwd);
            return (TbUserEntity) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
