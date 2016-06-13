package cn.edu.zucc.service.Article;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Article.ArticleDaoImpl;
import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.dao.Category.CategoryDaoImpl;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.ToparticlesEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by shentao on 2016/5/31.
 */
public interface ArticleService {

    //添加文章，半静态化，邮件通知订阅用户
    public boolean addArticle(TbArticleEntity article, String contextPath, String realPath);

    //更新文章信息，喜爱，访问量
    public void updateArticleInfo(TbArticleEntity article) throws Exception;

    //删除文章
    public void deleteArticle(int artid, String realPath) throws Exception;

    //得到模板引擎参数
    public Map<String, Object> getArticleListParams(String contextPath) throws Exception;

    //查询所有文章
    public List<TbArticleEntity> getAllArtcles() throws Exception;
    public List<ToparticlesEntity> getArtclesList() throws Exception;

    //根据条件查询
    public List<TbArticleEntity> findByqQuery(String hql,int i) throws Exception;
    public TbArticleEntity findById(Integer id) throws Exception;

    //得到freemarker模版文件所需参数
    public Map<String, Object> getTemplateParams(int artid, String contextPath, boolean isNew) throws Exception;

    //分页查询文章
    public Page<TbArticleEntity> getPageArticles(String pagenum, String url) throws Exception;

    //修改文章内容，半静态化，通知订阅用户
    public boolean updateArticle(TbArticleEntity temp, String contextPath, String realPath) throws Exception;

}
