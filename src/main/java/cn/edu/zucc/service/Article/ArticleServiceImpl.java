package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.util.Global;
import cn.edu.zucc.util.ServiceUtils;
import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public class ArticleServiceImpl implements ArticleService{


    private ArticleDao articleDao ;
    private CategoryDao categoryDao;

    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public boolean addArticle(TbArticleEntity article, String contextPath, String realPath) {
        try {

            System.out.println("ArticleServiceImpl中的likes="+article.getArticleLikes());
            System.out.println("ArticleServiceImpl中的looks="+article.getArticleLooks());

            //保存数据库
            articleDao.save(article);
            boolean result = true;
            article.setArticleId(article.getArticleId());

            //静态化页面
            List<TbCategoryEntity> list =categoryDao.findAll();
            Global.setCategories(list);
            Global.setCategories_cached(false);

            //静态化路径
            article.setArticleStaticUrl(article.staticPath());
            TbCategoryEntity category = categoryDao.findById(article.getCategoryId());
            ServiceUtils.staticPage(article, contextPath, category, realPath);

            //储存静态化页面路径以及存储likes、looks等属性
            articleDao.updateArticleInfo(article);


            return result;


        } catch (Exception e) {
            e.printStackTrace();      throw new RuntimeException(e);
        }



    }

    @Override
    public boolean addArticle1(TbArticleEntity article) {
        boolean flag = false;
        try {
             flag =  articleDao.save(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void updateArticleInfo(TbArticleEntity article) {

    }

    @Override
    public void deleteArticle(int artid, String realPath) {

    }

    @Override
    public List<TbArticleEntity> getAllArtcles() {
        return articleDao.findAll();
    }

    //得到所有类别



}
