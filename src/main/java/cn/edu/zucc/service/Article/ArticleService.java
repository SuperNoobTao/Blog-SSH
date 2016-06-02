package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.TbArticleEntity;

/**
 * Created by shentao on 2016/5/31.
 */
public interface ArticleService {



    //添加文章，半静态化，邮件通知订阅用户
    public boolean addArticle(TbArticleEntity article, String contextPath, String realPath);

    //更新文章信息，喜爱，访问量
    public void updateArticleInfo(TbArticleEntity article) ;


    //删除文章
    public void deleteArticle(int artid, String realPath);




}
