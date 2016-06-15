package test.cn.edu.zucc.service.Category; 

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.TbUserEntity;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/** 
* CategoryServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 3, 2016</pre> 
* @version 1.0 
*/



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class CategoryServiceImplTest { 

    @Resource
    CategoryDao categoryDao;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getCategoryDao() 
* 
*/ 
@Test
public void testGetCategoryDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setCategoryDao(CategoryDao categoryDao) 
* 
*/ 
@Test
public void testSetCategoryDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllCategories() 
* 
*/ 
@Test
public void testGetAllCategories() throws Exception { 
//TODO: Test goes here...

    List list = categoryDao.findAll();
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
        TbCategoryEntity tbCategoryEntity = (TbCategoryEntity) iterator.next();
        System.out.println(tbCategoryEntity.getCategoryName());
    }



} 

/** 
* 
* Method: addCategory(TbCategoryEntity tbCategoryEntity) 
* 
*/ 
@Test
public void testAddCategory() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteCategory(TbCategoryEntity tbCategoryEntity) 
* 
*/ 
@Test
public void testDeleteCategory() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: queryCategory(Integer id) 
* 
*/ 
@Test
public void testQueryCategory() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findByqQuery(String hql) 
* 
*/ 
@Test
public void testFindByqQuery() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateCategory(TbCategoryEntity tbCategoryEntity) 
* 
*/ 
@Test
public void testUpdateCategory() throws Exception { 
//TODO: Test goes here...
    TbCategoryEntity temp ;
    temp = categoryDao.findById(4);
    temp.setCategoryName("java2222");
    temp.setCategoryRemark("2312312321321");
    categoryDao.update(temp);

} 


} 
