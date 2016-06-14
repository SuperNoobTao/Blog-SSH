package cn.edu.zucc.dao.common;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public abstract class CommonDaoImpl<T> implements CommonDAO<T> {
    private SessionFactory sessionFactory;//加载数据库连接（使用spring实现加载）

    private Class<T> entityClass;
    //sessionFactory的get和set方法。
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //用构造方法处理Class<T>以下为固定模式
    public CommonDaoImpl()
    {
        Type type=getClass().getGenericSuperclass();
        entityClass=(Class<T>) ((ParameterizedType)type).getActualTypeArguments()[0];
    }





    //对表的操作（增删改查）
    //保存
    public boolean save(T transientInstance) throws Exception
    {
        try {
            getSessionFactory().getCurrentSession().save(transientInstance);
            return true;
        } catch (RuntimeException e) {
           return false;
        }
    }

    //删除
    public boolean delete(T persistentInstance) throws SQLException
    {
        try {
            getSessionFactory().getCurrentSession().delete(persistentInstance);
            return true;
        } catch (RuntimeException e) {
            return  false;
        }
    }


    //更新
    public boolean update(T instance) throws Exception
    {
        try {
            getSessionFactory().getCurrentSession().saveOrUpdate(instance);
            return true;
        } catch (RuntimeException e) {
            // TODO: handle exception
            return false;
        }
    }


    //根据传进来的HQL语句更新，返回受影响行数
    public int updateByQuery(String hql)
    {
        int k=0;
        try {
            k=getSessionFactory().getCurrentSession().createQuery(hql).executeUpdate();
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
        return k;
    }

    //根据传进来的ID进行查询
    public T findById(Integer id)
    {

        try {
            T instance = (T) getSessionFactory().getCurrentSession().get(entityClass, id);
            return instance;
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }

    //根据传进来的hql查询
    public List<T> findByqQuery(String hql)
    {
        try {
            return getSessionFactory().getCurrentSession().createQuery(hql).list();

        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }

    //查找所有表里的所有内容
    public List<T> findAll()
    {
        List<T> list=null;
        try {
        list=getSessionFactory().getCurrentSession().createCriteria(entityClass).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return list;
    }


    //jQuery Easyui Datagrid需要的方法，根据传进来的hql，当前页数，页面长度返回数据列
    public List<T> queryForPage(String hql, int offset, int length) {
        try{
            List<T> results=sessionFactory.getCurrentSession().createQuery(hql)
                    .setFirstResult(offset)
                    .setMaxResults(length)
                    .list();
            return results;
        }catch (RuntimeException re) {
            throw re;
        }
    }


}
