package cn.edu.zucc.dao.Guest;
import cn.edu.zucc.dao.common.CommonDaoImpl;
import cn.edu.zucc.model.TbGuestEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public class GuestDaoImpl extends CommonDaoImpl<TbGuestEntity> implements GuestDao{

    //查询单个
    @Override
    public TbGuestEntity queryGuestByEmail(String email) throws SQLException {
        String hql ="from TbGuestEntity where guestEmail=?";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setString(0,email);
        return (TbGuestEntity) query.uniqueResult();
    }

    //查询分页
    @Override
    public List<TbGuestEntity> getPageData(int startindex, int pagesize) throws SQLException {
        String hql ="from TbGuestEntity ";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setFirstResult((startindex/pagesize)*pagesize);
        query.setMaxResults(pagesize);
        List<TbGuestEntity> list = query.list();
        return list;
    }

    //查总数
    @Override
    public long queryCount() throws SQLException {
        String hql = "select count(*)  from TbGuestEntity ";
        long count = (long) getSessionFactory().getCurrentSession().createQuery(hql).uniqueResult();
        return  count;
    }

    @Override
    public List<TbGuestEntity> queryRssGuests() throws SQLException {
        return null;
    }
}
