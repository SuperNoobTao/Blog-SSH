package cn.edu.zucc.dao.Guest;

import cn.edu.zucc.common.CommonDAO;
import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.model.TbGuestEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public interface GuestDao extends CommonDAO<TbGuestEntity> {



    //查询单个
    TbGuestEntity queryGuestByEmail(String email) throws SQLException;

    //查询分页
    List<TbGuestEntity> getPageData(int startindex, int pagesize) throws SQLException;

    //查总数
    long queryCount() throws SQLException;

    List<TbGuestEntity> queryRssGuests() throws SQLException;

}
