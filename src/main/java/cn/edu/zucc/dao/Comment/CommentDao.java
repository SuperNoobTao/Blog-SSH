package cn.edu.zucc.dao.Comment;

import cn.edu.zucc.dao.common.CommonDAO;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.VCommentEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public interface CommentDao extends CommonDAO<TbCommentEntity>{

    //查询总数
    long queryCount() throws SQLException;

    //查分页
    List<VCommentEntity> getPageData(int startindex, int pagesize) throws SQLException;

    //查询总数
    long queryGuestCount(int gid) throws SQLException;

    //查分页
    List<VCommentEntity> getGuestPageData(int gid, int startindex, int pagesize) throws SQLException;



}
