package cn.edu.zucc.service.Category;

import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.TbCategoryEntity;

import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public class CategoryServiceImpl implements CategoryService{


    private CategoryDao categoryDao;


    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }



    //得到所有类别
    @Override
    public List<TbCategoryEntity> getAllCategories()  {
        return getCategoryDao().findAll();
    }
    //添加类别
    @Override
    public boolean addCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        String categoryName = tbCategoryEntity.getCategoryName();
        System.out.println("categoryName="+categoryName);
        List list = categoryDao.findByqQuery("from TbCategoryEntity where categoryName='"+categoryName+"'");
        if(list.isEmpty()){
        return categoryDao.save(tbCategoryEntity);
        }
        return false;
    }
    //删除类别
    @Override
    public boolean deleteCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        return categoryDao.delete(tbCategoryEntity);
    }
    //查询指定类别 id
    @Override
    public TbCategoryEntity queryCategory(Integer id) throws Exception {
        return categoryDao.findById(id);
    }
    //查询指定类别 byquery
    @Override
    public List<TbCategoryEntity> findByqQuery(String hql) throws Exception {
        return categoryDao.findByqQuery(hql);
    }
    //更新类别
    @Override
    public boolean updateCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        return categoryDao.update(tbCategoryEntity);
    }
}
