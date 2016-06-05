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
    public List<TbCategoryEntity> getAllCategories() throws Exception {
        return getCategoryDao().findAll();
    }


    //添加类别
    @Override
    public boolean addCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        String categoryName = tbCategoryEntity.getCategoryName();
        System.out.println("categoryName="+categoryName);
            TbCategoryEntity temp = categoryDao.findByName(categoryName);
        if(temp != null){
            return false;
        }
            return categoryDao.save(tbCategoryEntity);
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
    //查询指定类别 name
    @Override
    public TbCategoryEntity findByName(String name) throws Exception {
        return categoryDao.findByName(name);
    }
    //更新类别
    @Override
    public boolean updateCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        return categoryDao.update(tbCategoryEntity);
    }
}
