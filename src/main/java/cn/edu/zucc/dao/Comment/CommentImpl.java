package cn.edu.zucc.dao.Comment;

import cn.edu.zucc.common.CommonDAO;
import cn.edu.zucc.common.CommonDaoImpl;
import cn.edu.zucc.model.TbCommentEntity;

import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public class CommentImpl  extends CommonDaoImpl<TbCommentEntity> implements CommentDao{
    @Override
    public boolean save(TbCommentEntity transientInstance) throws Exception {
        return false;
    }

    @Override
    public boolean delete(TbCommentEntity persistentInstance) throws Exception {
        return false;
    }

    @Override
    public boolean update(TbCommentEntity instance) throws Exception {
        return false;
    }

    @Override
    public int updateByQuery(String hql) {
        return 0;
    }

    @Override
    public TbCommentEntity findById(Integer id) {
        return null;
    }

    @Override
    public List<TbCommentEntity> findByqQuery(String hql) {
        return null;
    }

    @Override
    public List<TbCommentEntity> findAll() {
        return null;
    }

    @Override
    public List<TbCommentEntity> queryForPage(String hql, int offset, int length) {
        return null;
    }
}
