package cn.edu.zucc.dao.Category;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import org.hibernate.Query;

/**
 * Created by shentao on 2016/5/31.
 */
public class CategoryDaoImpl extends CommonDaoImpl<TbCategoryEntity> implements CategoryDao{


    @Override
    public long getCount() throws Exception {
        String hql = "select count(*)  from TbCategoryEntity";
        long count = (long) getSessionFactory().getCurrentSession().createQuery(hql).uniqueResult();
        return  count;
    }
}
