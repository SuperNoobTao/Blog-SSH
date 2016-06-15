package test.cn.edu.zucc.service.Article; 

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.security.Timestamp;
import java.util.Iterator;
import java.util.List;

/** 
* ArticleServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class ArticleServiceImplTest { 

        @Resource
        ArticleDao articleDao;
        @Resource
        UserDao userDao;


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getArticleDao() 
* 
*/ 
@Test
public void testGetArticleDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setArticleDao(ArticleDao articleDao) 
* 
*/ 
@Test
public void testSetArticleDao() throws Exception { 
//TODO: Test goes here... 
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
* Method: addArticle(TbArticleEntity article, String contextPath, String realPath) 
* 
*/ 
@Test
public void testAddArticle() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateArticleInfo(TbArticleEntity article) 
* 
*/ 
@Test
public void testUpdateArticleInfo() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteArticle(int artid, String realPath) 
* 
*/ 
@Test
public void testDeleteArticle() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getArticleListParams(String contextPath) 
* 
*/ 
@Test
public void testGetArticleListParams() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllArtcles() 
* 
*/ 
@Test
public void testGetAllArtcles() throws Exception { 
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
//        List<LastarticleEntity> lastArticles;
//        lastArticles = articleDao.findAllLastarticle();
//
//        for(int i =0; i<lastArticles.size(); i++){
//                System.out.print(lastArticles.get(i).getArticleId());
//                System.out.print(lastArticles.get(i).getArticleTitle());
//                System.out.print(lastArticles.get(i).getArticleCdate());
//                System.out.print(lastArticles.get(i).getCategoryId());
//                System.out.println(lastArticles.get(i).getArticleStaticUrl());
//        }
//
//        System.out.println("top");
//        List<ToparticlesEntity> topArticles;
//        topArticles = articleDao.findAllToparticle();
//        for(int i =0; i<topArticles.size(); i++){
//                System.out.print(topArticles.get(i).getArticleId());
//                System.out.print(topArticles.get(i).getArticleTitle());
//                System.out.print(topArticles.get(i).getArticleCdate());
//                System.out.print(topArticles.get(i).getArticleLooks());
//                System.out.print(topArticles.get(i).getArticleLikes());
//                System.out.print(topArticles.get(i).getArticleMeta());
//                System.out.print(topArticles.get(i).getArticleType());
//                System.out.print(topArticles.get(i).getCategoryName());
//                System.out.print(topArticles.get(i).getArticleAuthor());
//                System.out.print(topArticles.get(i).getCategoryId());
//                System.out.println(topArticles.get(i).getArticleStaticUrl());
//        }


//        System.out.println("articles");
//        List<ArticlesEntity> articlesEntities;
//        articlesEntities = articleDao.findArticles(11);
//        for(int i =0; i<articlesEntities.size(); i++){
//                System.out.print(articlesEntities.get(i).getArticleId());
//                System.out.print(articlesEntities.get(i).getArticleTitle());
//                System.out.print(articlesEntities.get(i).getArticleCdate());
//                System.out.print(articlesEntities.get(i).getArticleLooks());
//                System.out.print(articlesEntities.get(i).getArticleLikes());
//                System.out.print(articlesEntities.get(i).getCategoryId());
//                System.out.println(articlesEntities.get(i).getArticleStaticUrl());
//        }

        System.out.println("加载manage页面时初始化文章列表");
        List<ToparticlesEntity> toparticlesEntityList;
        toparticlesEntityList = articleDao.findArticleList();
        for(int i =0; i<toparticlesEntityList.size(); i++){
                System.out.print(","+toparticlesEntityList.get(i).getArticleId());
                System.out.print(","+toparticlesEntityList.get(i).getArticleTitle());
                System.out.print(","+toparticlesEntityList.get(i).getArticleCdate());
                System.out.print(","+toparticlesEntityList.get(i).getArticleLooks());
                System.out.print(","+toparticlesEntityList.get(i).getArticleLikes());
                System.out.print(","+toparticlesEntityList.get(i).getArticleStaticUrl());
                System.out.println(","+toparticlesEntityList.get(i).getArticleTop());
                System.out.println(","+toparticlesEntityList.get(i).getCategoryId());
        }


} 


} 
