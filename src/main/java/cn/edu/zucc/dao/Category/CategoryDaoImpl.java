package cn.edu.zucc.dao.Category;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;

/**
 * Created by shentao on 2016/5/31.
 */
public class CategoryDaoImpl extends CommonDaoImpl<TbCategoryEntity> implements CategoryDao{
    @Override
    public long getCount() throws Exception {
        return 0;
    }

    @Override
    public TbCategoryEntity findByName(String name) throws Exception {
        return null;
    }
}
