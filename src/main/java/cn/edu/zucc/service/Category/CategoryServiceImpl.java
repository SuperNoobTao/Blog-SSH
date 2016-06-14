package cn.edu.zucc.service.Category;

import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.exception.ForeignKeyException;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.util.Global;
import org.springframework.jdbc.support.JdbcUtils;

import java.sql.SQLException;
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
        //缓存中有，直接查询缓存
        if (Global.isCategories_cached()) {
            List<TbCategoryEntity> list =Global.getCategories();
            for (int i = 0;i<list.size();i++) {
                System.out.println("缓存="+list.get(i).toString());
            }
            return Global.getCategories();
        }
        //还没缓存  查询数据库
        List<TbCategoryEntity> list = categoryDao.findAll();
        Global.setCategories(list);
        Global.setCategories_cached(true);

        return list;
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
    public boolean deleteCategory(int categoryId) throws ForeignKeyException {
        try {
        TbCategoryEntity tbCategoryEntity;
        tbCategoryEntity = categoryDao.findById(categoryId);
        return categoryDao.delete(tbCategoryEntity);
        } catch (Exception e) {
            if(e.getMessage().contains("a foreign key constraint fails"))
                throw new ForeignKeyException(e);
            throw new RuntimeException(e);
        }
    }


    //查询指定类别
    public TbCategoryEntity queryCategory(Integer cid) throws Exception {
        // 设置事务隔离级别
        TbCategoryEntity category = categoryDao.findById(cid);
        return category;
    }


    //更新类别
    @Override
    public boolean updateCategory(TbCategoryEntity tbCategoryEntity) throws Exception {
        TbCategoryEntity temp ;
        temp = categoryDao.findById(tbCategoryEntity.getCategoryId());
        temp.setCategoryName(tbCategoryEntity.getCategoryName());
        temp.setCategoryRemark(tbCategoryEntity.getCategoryRemark());
        return categoryDao.update(temp);
    }


    //查询指定类别 name
    @Override
    public TbCategoryEntity findByName(String name) throws Exception {
        return categoryDao.findByName(name);
    }


    //分页查询类别
    public Page<TbCategoryEntity> queryPageCategory(String pagenum, String url) throws Exception {
        System.out.println("页号"+pagenum);
        // 总记录数
        int totalrecord = (int) categoryDao.getCount();
        Page<TbCategoryEntity> page = null;
        if (pagenum == null)
            // 没传递页号，回传第一页数据
            page = new Page<TbCategoryEntity>(totalrecord, 1);
        else
            // 根据传递的页号查找所需显示数据
            page = new Page<TbCategoryEntity>(totalrecord, Integer.parseInt(pagenum));
        System.out.println("page.getStartindex()"+page.getStartindex());
        List<TbCategoryEntity> list = categoryDao.getPageData(page.getStartindex(),
                page.getPagesize());
        page.setList(list);
        page.setUrl(url);
        return  page;

    }


}
