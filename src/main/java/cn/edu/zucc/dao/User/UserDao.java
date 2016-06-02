package cn.edu.zucc.dao.User;

import cn.edu.zucc.model.TbUserEntity;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface UserDao {
    public boolean save(TbUserEntity tbUserEntity) throws Exception;
    public boolean delete(TbUserEntity tbUserEntity) throws Exception;
    public boolean update(TbUserEntity tbUserEntity) throws Exception;
    public TbUserEntity login(String uAcount, String uPwd) throws Exception;
    public int updateByQuery(String hql);
    public TbUserEntity findById(Integer id);
    public List<TbUserEntity> findByqQuery(String hql);
    public List<TbUserEntity> findAll();
    public  List<TbUserEntity> queryForPage(String hql, int offset,int length);











}
