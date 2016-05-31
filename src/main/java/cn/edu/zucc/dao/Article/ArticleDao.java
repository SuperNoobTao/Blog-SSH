package cn.edu.zucc.dao.Article;

import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbUserEntity;
import jdk.nashorn.internal.runtime.ECMAException;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface ArticleDao {

    //增
    public  void  save(TbArticleEntity tbArticleEntity)  throws Exception;

    //删
    public void delete(TbArticleEntity tbArticleEntity)  throws Exception;

    //改
    public void update(TbArticleEntity tbArticleEntity)  throws Exception;

    public void updateArticleInfo(TbArticleEntity tbArticleEntity) throws Exception;

    //查总数


    //查分页


    //查单个
    public TbArticleEntity findById(Integer id) throws Exception;

    //查单个
    public TbArticleEntity findByIdinfo(Integer id) throws Exception;

    //根据条件查询







}
