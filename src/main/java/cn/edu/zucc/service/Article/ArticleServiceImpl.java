package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.*;
import cn.edu.zucc.util.Global;
import cn.edu.zucc.util.ServiceUtils;
import com.sun.xml.internal.ws.server.ServerRtException;
import org.apache.struts2.ServletActionContext;

import java.io.File;
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
    public void updateArticleInfo(TbArticleEntity article) throws Exception {
    articleDao.updateArticleInfo(article);
    }


    //删除文章
    @Override
    public void deleteArticle(int artid, String realPath) throws Exception {
        TbArticleEntity article = articleDao.findById(artid);
        //删除数据库记录
        articleDao.delete(article);
        //删除静态化文件
        String path = realPath+ article.getArticleStaticUrl()+".ftl";
        File file = new File(path);
        if(file.exists()) {
            file.delete();
            //System.out.println("File delete....");
        }

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

    @Override
    public List<ToparticlesEntity> getArtclesList() throws Exception {
       return  articleDao.findAllToparticle();
    }


    //根据条件查询
    @Override
    public List<TbArticleEntity> findByqQuery(String hql,int i) throws Exception {
        return articleDao.findByqQuery(hql,i);
    }

    @Override
    public TbArticleEntity findById(Integer id) throws Exception {
        return articleDao.findById(id);
    }


    //得到freemarker模版文件所需参数
    @Override
    public Map<String, Object> getTemplateParams(int artid, String contextPath, boolean isNew) throws Exception {

        System.out.println("artid="+artid);
        //要看的文章
        List<ArticlesEntity> articles = getArticleDao().findArticles(artid);

        if (articles.size() <= 0)
            return null;

        //最新三篇文章
        List<LastarticleEntity> lastArticles = null;
        //先查缓存
        if (Global.isIsLast())
            lastArticles = Global.getLastArticles();
        else {
            lastArticles = articleDao.findAllLastarticle();
            Global.setLastArticles(lastArticles);
            Global.setIsLast(false);
        }

        //所有类别
        List<TbCategoryEntity> categories = null;
        //先查缓存
        if (Global.isCategories_cached())
            categories = Global.getCategories();
        else {
            categories = categoryDao.findAll();
            Global.setCategories(categories);
            Global.setCategories_cached(false);
        }



        //下一篇
        ArticlesEntity next = null;
        List<ArticlesEntity> nextArticles = articleDao.findNextArticle(articles.get(0).getArticleCdate());
        if (nextArticles == null || nextArticles.size() <= 0) {
            next = new ArticlesEntity();
            next.setArticleStaticUrl("#");
            next.setArticleTitle("这是最后一篇了哦！");
        } else {
            next = nextArticles.get(0);
            next.setArticleStaticUrl(contextPath + next.getArticleStaticUrl() + ".html");
        }

        //上一篇文章
        ArticlesEntity last = null;
        List<ArticlesEntity> lastAs = articleDao.findLastArticle(articles.get(0).getArticleCdate());
        if (lastAs == null || lastAs.size() <= 0) {
            last = new ArticlesEntity();
            last.setArticleStaticUrl("#");
            last.setArticleTitle("这是第一篇哦！");
        } else {
            last = lastAs.get(0);
            last.setArticleStaticUrl(contextPath + last.getArticleStaticUrl() + ".html");
        }

        //封装模版所需参数
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("looked", articles.get(0).getArticleLooks());
        params.put("artid", artid);
        params.put("likes", articles.get(0).getArticleLikes());
        params.put("lastArticlesList", lastArticles);
        params.put("categoryList", categories);
        params.put("likesURL", contextPath + "/likeAction.action?artid=" + artid);
        params.put("nextArticle", next);
        params.put("lastArticle", last);
        params.put("staticURL", articles.get(0).getArticleStaticUrl());


        return params;
    }

    //分页查询文章
    @Override
    public Page<TbArticleEntity> getPageArticles(String pagenum, String url) throws Exception {
        int totalrecord = (int) articleDao.getCount();
        Page<TbArticleEntity> page = null;
        if (pagenum == null)
            // 没传递页号，回传第一页数据
            page = new Page<TbArticleEntity>(totalrecord, 1);
        else
            // 根据传递的页号查找所需显示数据
            page = new Page<TbArticleEntity>(totalrecord, Integer.parseInt(pagenum));
        List<TbArticleEntity> list = articleDao.getPageData(null, null, page.getStartindex(),
                page.getPagesize());
        page.setList(list);
        page.setUrl(url);
        return page;
    }



    //修改文章内容，半静态化，通知订阅用户
    @Override
    public boolean updateArticle(TbArticleEntity temp, String contextPath, String realPath) throws Exception {
        boolean result = true;

        TbArticleEntity article = articleDao.findById(temp.getArticleId());
        article.setArticleType(temp.getArticleType());
        article.setArticleContent(temp.getArticleContent());
        article.setCategoryId(temp.getCategoryId());
        article.setArticleTitle(temp.getArticleTitle());
        article.setArticleMdate(temp.getArticleMdate());
        article.setArticleMeta(temp.getArticleMeta());
        article.setArticleTop(temp.getArticleTop());
        //保存数据库
        articleDao.update(article);
        //静态化页面

        List<TbCategoryEntity> list = categoryDao.findAll();

        TbCategoryEntity category = categoryDao.findById(article.getCategoryId());
        ServiceUtils.staticPage(article, contextPath, category, realPath);

        //储存静态化页面路径
        article.setArticleStaticUrl(article.staticPath());
        articleDao.updateArticleInfo(article);

    return result;
    }


}
