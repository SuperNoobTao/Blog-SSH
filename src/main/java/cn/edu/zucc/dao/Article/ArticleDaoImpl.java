package cn.edu.zucc.dao.Article;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbUserEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/5/31.
 */
public class ArticleDaoImpl  extends CommonDaoImpl<TbArticleEntity> implements ArticleDao {


    @Override
    public void updateArticleInfo(TbArticleEntity tbArticleEntity) throws Exception {

        System.out.println("articleId="+tbArticleEntity.getArticleId());
        System.out.println("articleLikes="+tbArticleEntity.getArticleLikes());
        System.out.println("articleCdate="+tbArticleEntity.getArticleCdate());
        System.out.println("articleLooks="+tbArticleEntity.getArticleLooks());
        System.out.println("articleStaticUrl="+tbArticleEntity.getArticleStaticUrl());


        String hql ="update TbArticleEntity set articleLikes=? , articleCdate=?,articleLooks=?,articleStaticUrl=? where articleId=?";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setInteger(0,tbArticleEntity.getArticleLikes());
        query.setTimestamp(1,tbArticleEntity.getArticleCdate());
        query.setInteger(2,tbArticleEntity.getArticleLooks());
        query.setString(3,tbArticleEntity.getArticleStaticUrl());
        query.setInteger(4,tbArticleEntity.getArticleId());

    }

    @Override
    public TbArticleEntity findByIdinfo(Integer id) throws Exception {
        String hql ="select articleId,articleLooks,articleLikes,articleMdate,articleStaticUrl from TbArticleEntity where articleId=?";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hql);
        query.setInteger(0,id);
        return (TbArticleEntity) query.uniqueResult();

    }





}
