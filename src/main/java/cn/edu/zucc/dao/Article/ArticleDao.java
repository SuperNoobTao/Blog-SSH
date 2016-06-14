package cn.edu.zucc.dao.Article;

import cn.edu.zucc.dao.common.CommonDAO;
import cn.edu.zucc.model.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface ArticleDao extends CommonDAO<TbArticleEntity> {



    public void updateArticleInfo(TbArticleEntity tbArticleEntity) throws Exception;

    //查总数
    public  long getCount() throws Exception;

    //查所有

    public List<ToparticlesEntity> findArticleList() throws Exception;

    //查分页
    List<TbArticleEntity> getPageData(String selection, Object[] params, int startindex, int pagesize) throws SQLException;

    //查单个byname
    public TbArticleEntity findByIdinfo(Integer id) throws Exception;

    //根据条件查询前几条
    public List<TbArticleEntity> findByqQuery(String hql,int i);

    //查最新的三条记录
    public List<LastarticleEntity> findAllLastarticle();

    //查顶端的四条记录
    public List<ToparticlesEntity> findAllToparticle();

    //查分页
    public List<ArticlesEntity> findArticles(int articleId);
    //查next
    public List<ArticlesEntity> findNextArticle(Timestamp Cdate);
    //查last
    public List<ArticlesEntity> findLastArticle(Timestamp Cdate);


    //根据条件查询
    List<TbArticleEntity> queryArticleBySQL(String sql, Object[] params) throws SQLException;

}
