package test.cn.edu.zucc.dao.Article; 

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.service.Article.ArticleService;
import org.apache.struts2.components.Date;
import org.hibernate.Query;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

/** 
* ArticleDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 3, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class ArticleDaoImplTest { 


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: updateArticleInfo(TbArticleEntity tbArticleEntity) 
* 
*/ 
@Test
public void testUpdateArticleInfo() throws Exception { 
//TODO: Test goes here...
    TbArticleEntity tbArticleEntity = new TbArticleEntity();
    java.util.Date now = new java.util.Date();
    tbArticleEntity.setArticleLikes(1);
    tbArticleEntity.setArticleMdate((Timestamp) now);
    tbArticleEntity.setArticleLooks(1);
    tbArticleEntity.setArticleStaticUrl("/1/1/1/1");
    tbArticleEntity.setCategoryId(2);

} 

/** 
* 
* Method: findByIdinfo(Integer id) 
* 
*/ 
@Test
public void testFindByIdinfo() throws Exception { 
//TODO: Test goes here... 
}



/**
*
* Method: findByIdinfo(Integer id)
*
*/
@Test
public void findByqQuery(String hql,int i) throws Exception {
//TODO: Test goes here...
hql="sele";




}


} 
