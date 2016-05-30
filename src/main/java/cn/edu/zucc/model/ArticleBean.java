package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/29.
 */
@Entity
@Table(name = "article", schema = "blogs")
public class ArticleBean {
    private int artid;
    private Timestamp createtime;
    private String author;
    private Integer likes;
    private Integer looked;
    private String title;
    private String meta;
    private String content;
    private String staticUrl;
    private String type;
    private Integer top;
    private String remark;
    private Timestamp removetime;

    @Id
    @Column(name = "artid")
    public int getArtid() {
        return artid;
    }

    public void setArtid(int artid) {
        this.artid = artid;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "likes")
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "looked")
    public Integer getLooked() {
        return looked;
    }

    public void setLooked(Integer looked) {
        this.looked = looked;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "meta")
    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "staticUrl")
    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "top")
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "removetime")
    public Timestamp getRemovetime() {
        return removetime;
    }

    public void setRemovetime(Timestamp removetime) {
        this.removetime = removetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleBean that = (ArticleBean) o;

        if (artid != that.artid) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (likes != null ? !likes.equals(that.likes) : that.likes != null) return false;
        if (looked != null ? !looked.equals(that.looked) : that.looked != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (meta != null ? !meta.equals(that.meta) : that.meta != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (staticUrl != null ? !staticUrl.equals(that.staticUrl) : that.staticUrl != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (top != null ? !top.equals(that.top) : that.top != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (removetime != null ? !removetime.equals(that.removetime) : that.removetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artid;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        result = 31 * result + (looked != null ? looked.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (staticUrl != null ? staticUrl.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (top != null ? top.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (removetime != null ? removetime.hashCode() : 0);
        return result;
    }
}
