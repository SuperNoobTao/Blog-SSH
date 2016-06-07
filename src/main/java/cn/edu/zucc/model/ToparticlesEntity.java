package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/6/4.
 */
@Entity
@Table(name = "toparticles", schema = "blogs", catalog = "")
public class ToparticlesEntity {
    private String articleTitle;
    private Timestamp articleCdate;
    private Integer articleLooks;
    private Integer articleLikes;
    private String articleMeta;
    private String articleType;
    private int articleId;
    private String categoryName;
    private String articleAuthor;
    private int categoryId;
    private String articleStaticUrl;
    private int articleTop;

    @Basic
    @Column(name = "article_top")
    public int getArticleTop() {
        return articleTop;
    }

    public void setArticleTop(int articleTop) {
        this.articleTop = articleTop;
    }
    @Basic
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
    @Column(name = "article_looks")
    public Integer getArticleLooks() {
        return articleLooks;
    }

    public void setArticleLooks(Integer articleLooks) {
        this.articleLooks = articleLooks;
    }

    @Basic
    @Column(name = "article_likes")
    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    @Basic
    @Column(name = "article_meta")
    public String getArticleMeta() {
        return articleMeta;
    }

    public void setArticleMeta(String articleMeta) {
        this.articleMeta = articleMeta;
    }

    @Basic
    @Column(name = "article_type")
    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    @Id
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "article_author")
    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
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

        ToparticlesEntity that = (ToparticlesEntity) o;

        if (articleId != that.articleId) return false;
        if (categoryId != that.categoryId) return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;
        if (articleCdate != null ? !articleCdate.equals(that.articleCdate) : that.articleCdate != null) return false;
        if (articleLooks != null ? !articleLooks.equals(that.articleLooks) : that.articleLooks != null) return false;
        if (articleLikes != null ? !articleLikes.equals(that.articleLikes) : that.articleLikes != null) return false;
        if (articleMeta != null ? !articleMeta.equals(that.articleMeta) : that.articleMeta != null) return false;
        if (articleType != null ? !articleType.equals(that.articleType) : that.articleType != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (articleAuthor != null ? !articleAuthor.equals(that.articleAuthor) : that.articleAuthor != null)
            return false;
        if (articleStaticUrl != null ? !articleStaticUrl.equals(that.articleStaticUrl) : that.articleStaticUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleTitle != null ? articleTitle.hashCode() : 0;
        result = 31 * result + (articleCdate != null ? articleCdate.hashCode() : 0);
        result = 31 * result + (articleLooks != null ? articleLooks.hashCode() : 0);
        result = 31 * result + (articleLikes != null ? articleLikes.hashCode() : 0);
        result = 31 * result + (articleMeta != null ? articleMeta.hashCode() : 0);
        result = 31 * result + (articleType != null ? articleType.hashCode() : 0);
        result = 31 * result + articleId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (articleAuthor != null ? articleAuthor.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (articleStaticUrl != null ? articleStaticUrl.hashCode() : 0);
        return result;
    }
}
