package cn.edu.zucc.dao.Comment;

import cn.edu.zucc.common.CommonDAO;
import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.TbGuestEntity;
import cn.edu.zucc.model.VCommentEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public class CommentDaoImpl extends CommonDaoImpl<TbCommentEntity> implements CommentDao{

    //查询总数
    @Override
    public long queryCount() throws SQLException {
        String hql = "select count(*)  from TbCommentEntity ";
        long count = (long) getSessionFactory().getCurrentSession().createQuery(hql).uniqueResult();
        return  count;
    }
    //查分页
    @Override
    public List<VCommentEntity> getPageData(int startindex, int pagesize) throws SQLException {
        String hql ="from VCommentEntity order by commetCdate desc";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setFirstResult((startindex/pagesize)*pagesize);
        query.setMaxResults(pagesize);
        List<VCommentEntity> list = query.list();
        return list;
    }
    //查询客户的留言总数
    @Override
    public long queryGuestCount(int gid) throws SQLException {
        String hql = "select count(*)  from TbCommentEntity where guestId = ?";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setInteger(0,gid);
        long count = (long) query.uniqueResult();
        return  count;
    }
    //查客户的留言分页
    @Override
    public List<VCommentEntity> getGuestPageData(int gid, int startindex, int pagesize) throws SQLException {
        String hql ="from VCommentEntity where guestId = ? order by commetCdate";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setFirstResult((startindex/pagesize)*pagesize);
        query.setMaxResults(pagesize);
        List<VCommentEntity> list = query.list();
        return list;
    }



}
