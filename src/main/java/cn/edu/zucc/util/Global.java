package cn.edu.zucc.util;


import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 宇强 on 2016/3/12 0012.
 */
public class Global {
    //订阅缓存
    public static final int RSS_TRUE = 1;
    public static final int RSS_FALSE = 0;

    //类别
    private static boolean categories_cached = false;
    public static boolean isCategories_cached() {
        return categories_cached;
    }
    public static void setCategories_cached(boolean categories_cached) {
        Global.categories_cached = categories_cached;
    }
    private static List<TbCategoryEntity> categories = new ArrayList<TbCategoryEntity>();
    public static List<TbCategoryEntity> getCategories() {
        return categories;
    }
    public static void setCategories(List<TbCategoryEntity> categories) {
        Global.categories = categories;
    }

    //最新文件
    private static boolean isLast = false;
    public static boolean isIsLast() {
        return isLast;
    }
    public static void setIsLast(boolean isLast) {
        Global.isLast = isLast;
    }
    private static List<TbArticleEntity> lastArticles = new ArrayList<TbArticleEntity>();
    public static List<TbArticleEntity> getLastArticles() {
        return lastArticles;
    }
    public static void setLastArticles(List<TbArticleEntity> lastArticles) {
        lastArticles = lastArticles;
    }

    //网页标题
    public static final Map<String,String> pageTitles = new HashMap<String, String>();
    static {

    }
}
