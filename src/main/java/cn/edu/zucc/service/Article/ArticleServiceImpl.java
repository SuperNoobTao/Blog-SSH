package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;

/**
 * Created by shentao on 2016/5/31.
 */
public class ArticleServiceImpl implements ArticleService{


    private ArticleDao articleDao = new ArticleDaoImpl();

    @Override
    public boolean addArticle(TbArticleEntity article, String contextPath, String realPath) {
        try {
            boolean flag = articleDao.save(article);



        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
    public void updateArticleInfo(TbArticleEntity article) {

    }

    @Override
    public void deleteArticle(int artid, String realPath) {

    }

    //得到所有类别



}
