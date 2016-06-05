package cn.edu.zucc.dao.Article;

import cn.edu.zucc.model.*;
import jdk.nashorn.internal.runtime.ECMAException;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface ArticleDao {

    //增
    public  boolean  save(TbArticleEntity tbArticleEntity)  throws Exception;

    //删
    public boolean delete(TbArticleEntity tbArticleEntity)  throws Exception;

    //改
    public boolean  update(TbArticleEntity tbArticleEntity)  throws Exception;

    public void updateArticleInfo(TbArticleEntity tbArticleEntity) throws Exception;

    //查总数
    public  long getCount() throws Exception;

    //查所有
    public List<TbArticleEntity> findAll() throws Exception;

    //查分页
    //待定--------------

    //查单个
    public TbArticleEntity findById(Integer id) throws Exception;

    //查单个
    public TbArticleEntity findByIdinfo(Integer id) throws Exception;

    //根据条件查询前几条
    public List<TbArticleEntity> findByqQuery(String hql,int i);


    public List<LastarticleEntity> findAllLastarticle();

    public List<ToparticlesEntity> findAllToparticle();

    public List<ArticlesEntity> findAllArticles();

}
