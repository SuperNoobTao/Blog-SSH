package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.*;
import cn.edu.zucc.util.Global;
import cn.edu.zucc.util.ServiceUtils;
import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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





    //添加文章，半静态化，邮件通知订阅用户
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


    //更新文章信息，喜爱，访问量
    @Override
    public void updateArticleInfo(TbArticleEntity article) {

    }


    //删除文章
    @Override
    public void deleteArticle(int artid, String realPath) {

    }



    //得到模板引擎参数
    @Override
    public Map<String, Object> getArticleListParams(String contextPath) throws Exception {
        //最新三篇文章
        List<LastarticleEntity> lastArticles = null;
        lastArticles = articleDao.findAllLastarticle();

        //列表顶置四篇文章
        List<ToparticlesEntity> topArticles = null;
        topArticles  =  articleDao.findAllToparticle();

        //所有类别
        List<TbCategoryEntity> categories = null;
        categories = categoryDao.findAll();

        //封装模版所需参数
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("lastArticlesList", lastArticles);
        params.put("categories", categories);
        params.put("topArticles", topArticles);
        return params;
    }


    //查询所有文章
    @Override
    public List<TbArticleEntity> getAllArtcles() throws Exception {
        return articleDao.findAll();
    }



    //根据条件查询
    @Override
    public List<TbArticleEntity> findByqQuery(String hql,int i) throws Exception {
        return articleDao.findByqQuery(hql,i);
    }

    @Override
    public Map<String, Object> getTemplateParams(int artid, String contextPath, boolean isNew) throws Exception {

        //要看的文章
        List<ArticlesEntity> articles = articleDao.findAllArticles();
        if (articles.size() <= 0)
            return null;


        //最新三篇文章
        List<LastarticleEntity> lastArticles = null;
        lastArticles = articleDao.findAllLastarticle();

        //所有类别
        List<TbCategoryEntity> categories = null;
        categories = categoryDao.findAll();

        //封装模版所需参数
        Map<String, Object> params = new HashMap<String, Object>();




        return null;
    }


}
