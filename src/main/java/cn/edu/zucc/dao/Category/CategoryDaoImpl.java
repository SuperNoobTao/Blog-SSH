package cn.edu.zucc.dao.Category;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import org.hibernate.Query;
import org.hibernate.Session;

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
}
