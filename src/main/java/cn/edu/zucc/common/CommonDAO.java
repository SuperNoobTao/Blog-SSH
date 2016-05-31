package cn.edu.zucc.common;

import java.util.List;


/**
 * Created by shentao on 2016/5/21.
 */
public interface CommonDAO<T> {


    public void save(T transientInstance) throws Exception;

    public void delete(T persistentInstance) throws Exception;

    public  void update(T instance) throws Exception;

    public int updateByQuery(String hql);

    public T findById(Integer id);

    public List<T> findByqQuery(String hql);

    public List<T> findAll();

    public  List<T> queryForPage(String hql, int offset,int length);



}
