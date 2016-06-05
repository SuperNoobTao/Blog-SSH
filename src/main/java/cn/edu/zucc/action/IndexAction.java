package cn.edu.zucc.action;

import cn.edu.zucc.service.Article.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

/**
 * Created by shentao on 2016/3/17 0017.
 */
public class IndexAction extends ActionSupport{
    private ArticleService articleService;
    public ArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public String execute() throws Exception {

        //查询首页所需动态信息
        Map<String,Object> params = getArticleService().getArticleListParams(ServletActionContext.getRequest().getContextPath());
        ServletActionContext.getRequest().setAttribute("params",params);
        return SUCCESS;
    }
}
