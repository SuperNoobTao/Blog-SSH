package cn.edu.zucc.service.Guest;

import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.dao.Guest.GuestDao;
import cn.edu.zucc.exception.ForeignKeyException;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbGuestEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/13.
 */
public class GuestServiceImpl implements GuestService{
    private GuestDao guestDao ;
    private CommentDao commentDao ;

    public CommentDao getCommentDao() {
        return commentDao;
    }
    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }
    public GuestDao getGuestDao() {
        return guestDao;
    }
    public void setGuestDao(GuestDao guestDao) {
        this.guestDao = guestDao;
    }


    @Override
    public TbGuestEntity queryGuest(int gid) {
        TbGuestEntity guest = guestDao.findById(gid);
        return guest;
    }

    @Override
    public void deleteGuest(int gid) throws ForeignKeyException {
        TbGuestEntity guest = guestDao.findById(gid);
        try {
            guestDao.delete(guest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateGuest(TbGuestEntity guest) {
        try {
            guestDao.update(guest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //增加 现不需要
    @Override
    public void addGuest(TbGuestEntity guest) {

    }

    @Override
    public Page<TbGuestEntity> queryPageGuests(String pagenum, String url) throws SQLException {
        // 总记录数
        int totalrecord = (int) guestDao.queryCount();
        Page<TbGuestEntity> page = null;
        if (pagenum == null)
            // 没传递页号，回传第一页数据
            page = new Page<TbGuestEntity>(totalrecord, 1);
        else
            // 根据传递的页号查找所需显示数据
            page = new Page<TbGuestEntity>(totalrecord, Integer.parseInt(pagenum));
        List<TbGuestEntity> list = guestDao.getPageData(page.getStartindex(),
                page.getPagesize());
        page.setList(list);
        page.setUrl(url);
        return  page;
    }

    @Override
    public void deleteComment(int comid) {

    }
}

