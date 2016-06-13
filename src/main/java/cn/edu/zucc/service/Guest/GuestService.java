package cn.edu.zucc.service.Guest;

import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.dao.Guest.GuestDao;
import cn.edu.zucc.exception.ForeignKeyException;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.TbGuestEntity;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/6/13.
 */
public interface GuestService {


    //查询指定客户
    public TbGuestEntity queryGuest(int gid);

    //删除客户
    public void deleteGuest(int gid) throws ForeignKeyException;

    //更新客户信息
    public void updateGuest(TbGuestEntity guest);

    //添加客户
    public void addGuest(TbGuestEntity guest);

    //分页查询客户
    public Page<TbGuestEntity> queryPageGuests(String pagenum, String url) throws SQLException;

    //删除留言
    public void deleteComment(int comid);




}
