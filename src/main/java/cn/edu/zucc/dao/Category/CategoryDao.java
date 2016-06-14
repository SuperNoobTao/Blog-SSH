package cn.edu.zucc.dao.Category;

import cn.edu.zucc.dao.common.CommonDAO;
import cn.edu.zucc.model.TbCategoryEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface CategoryDao extends CommonDAO<TbCategoryEntity>{

    //查单个byname
    public TbCategoryEntity findByName(String name) throws Exception;


    //查所有
    public List<TbCategoryEntity> findAll() throws Exception;


    //查总数
    public  long getCount() throws Exception;

    //查询分页
    List<TbCategoryEntity> getPageData(int startindex, int pagesize) throws SQLException;








}
