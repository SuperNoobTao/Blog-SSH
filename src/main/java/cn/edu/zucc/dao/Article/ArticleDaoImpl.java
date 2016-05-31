package cn.edu.zucc.dao.Article;

import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbUserEntity;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/5/31.
 */
public class ArticleDaoImpl  extends CommonDaoImpl<TbArticleEntity> implements ArticleDao {
    @Override
    public void updateArticleInfo(TbArticleEntity tbArticleEntity) throws Exception {

    }

    @Override
    public TbArticleEntity findByIdinfo(Integer id) throws Exception {
        return null;
    }
}
