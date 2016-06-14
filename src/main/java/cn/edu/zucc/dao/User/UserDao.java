package cn.edu.zucc.dao.User;

import cn.edu.zucc.dao.Comment.CommentDao;
import cn.edu.zucc.dao.common.CommonDAO;
import cn.edu.zucc.model.TbUserEntity;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface UserDao extends CommonDAO<TbUserEntity>{

    public TbUserEntity login(String uAcount, String uPwd) throws Exception;













}
