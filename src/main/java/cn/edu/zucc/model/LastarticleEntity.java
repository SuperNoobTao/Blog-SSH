package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/6/4.
 */
@Entity
@Table(name = "lastarticle", schema = "blogs", catalog = "")
public class LastarticleEntity {
    private String articleTitle;
    private Timestamp articleCdate;
    private int articleId;
    private Integer categoryId;
    private String articleStaticUrl;

    @Basic
    @Id
    @Column(name = "article_title")
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "article_cdate")
    public Timestamp getArticleCdate() {
        return articleCdate;
    }

    public void setArticleCdate(Timestamp articleCdate) {
        this.articleCdate = articleCdate;
    }

    @Basic
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "article_staticUrl")
    public String getArticleStaticUrl() {
        return articleStaticUrl;
    }

    public void setArticleStaticUrl(String articleStaticUrl) {
        this.articleStaticUrl = articleStaticUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LastarticleEntity that = (LastarticleEntity) o;

        if (articleId != that.articleId) return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;
        if (articleCdate != null ? !articleCdate.equals(that.articleCdate) : that.articleCdate != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (articleStaticUrl != null ? !articleStaticUrl.equals(that.articleStaticUrl) : that.articleStaticUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleTitle != null ? articleTitle.hashCode() : 0;
        result = 31 * result + (articleCdate != null ? articleCdate.hashCode() : 0);
        result = 31 * result + articleId;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (articleStaticUrl != null ? articleStaticUrl.hashCode() : 0);
        return result;
    }
}
