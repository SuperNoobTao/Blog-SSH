package cn.edu.zucc.service.Visitor;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.dao.Guest.GuestDao;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.TbGuestEntity;
import cn.edu.zucc.model.VCommentEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/6/12.
 */
public class VisitorServiceImpl implements VisitorService{
    private GuestDao guestDao ;
    private CommentDao commentDao ;
    private ArticleDao articleDao ;

    public ArticleDao getArticleDao() {
        return articleDao;
    }
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
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
    public long addGuest(TbGuestEntity guest) throws Exception {
        TbGuestEntity g = guestDao.queryGuestByEmail(guest.getGuestEmail());
        if(g!=null){
            g.setGuestName(guest.getGuestName());
            guestDao.update(g);
            return g.getGuestId();
        }
        //邮箱不存在
        guestDao.save(guest);

        return guest.getGuestId();
    }

    @Override
    public void addComment(TbGuestEntity guest, TbCommentEntity comment, String contextPath) throws Exception {
        commentDao.save(comment);
    }

    @Override
    public Page<VCommentEntity> findComments(String pagenum, String url) throws SQLException {
        System.out.println("进入findComment");
        // 总记录数
        int totalrecord = (int) commentDao.queryCount();
        System.out.println(totalrecord);
        Page<VCommentEntity> page = null;
        if (pagenum == null)
            // 没传递页号，回传第一页数据
            page = new Page<VCommentEntity>(totalrecord, 1);
        else
            // 根据传递的页号查找所需显示数据
            page = new Page<VCommentEntity>(totalrecord, Integer.parseInt(pagenum));
        System.out.println(page.getStartindex()+","+page.getPagesize());
        List<VCommentEntity> list = commentDao.getPageData(page.getStartindex(),
                page.getPagesize());
        page.setList(list);
        page.setUrl(url);
        System.out.println(url);
        return page;
    }
}
