package cn.edu.zucc.dao.Category;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public class CategoryDaoImpl extends CommonDaoImpl<TbCategoryEntity> implements CategoryDao{




    @Override
    public TbCategoryEntity findByName(String name) throws Exception {
        String hql ="select categoryId,categoryName,categoryCdate,categoryMdate,categoryRdate,categoryRemark from TbCategoryEntity where categoryName=?";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setString(0,name);
        return (TbCategoryEntity) query.uniqueResult();
    }

    @Override
    public long getCount() throws Exception {
        String hql = "select count(*)  from TbCategoryEntity";
        long count = (long) getSessionFactory().getCurrentSession().createQuery(hql).uniqueResult();
        return  count;
    }

    @Override
    public List<TbCategoryEntity> getPageData(int startindex, int pagesize) throws SQLException {
        String hql ="from TbCategoryEntity";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setFirstResult((startindex/pagesize)*pagesize);
        query.setMaxResults(pagesize);
        List<TbCategoryEntity> list = query.list();
        for (int i = 0 ;i < list.size() ; i++) {
            System.out.println(list.get(i).getCategoryName());
        }
        return list;
    }
}
