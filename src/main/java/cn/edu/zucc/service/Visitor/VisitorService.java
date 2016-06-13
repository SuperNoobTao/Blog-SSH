package cn.edu.zucc.service.Visitor;

import cn.edu.zucc.dao.Article.ArticleDao;
import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.dao.Guest.GuestDao;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCommentEntity;
import cn.edu.zucc.model.TbGuestEntity;
import cn.edu.zucc.model.VCommentEntity;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/6/12.
 */
public interface VisitorService {
    //添加客户，留言的时候自动记录客户
    public long addGuest(TbGuestEntity guest) throws Exception;
    //添加留言
    public void addComment(TbGuestEntity guest, TbCommentEntity comment, String contextPath) throws Exception;
    //分页查询留言
    public Page<VCommentEntity> findComments(String pagenum, String url) throws SQLException;


}
