package cn.edu.zucc.common;

import java.util.List;


/**
 * Created by shentao on 2016/5/21.
 */
public interface CommonDAO<T> {


    public boolean save(T transientInstance) throws Exception;

    public boolean delete(T persistentInstance) throws Exception;

    public  boolean update(T instance) throws Exception;

    public int updateByQuery(String hql);

    public T findById(Integer id);

    public List<T> findByqQuery(String hql);

    public List<T> findAll();

    public  List<T> queryForPage(String hql, int offset,int length);



}
