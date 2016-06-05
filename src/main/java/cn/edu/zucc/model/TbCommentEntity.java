package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_comment", schema = "blogs", catalog = "")
public class TbCommentEntity {
    private int commetId;
    private String commetContent;
    private int guestId;
    private int articleId;
    private Timestamp commetCdate;
    private Timestamp commetMdate;
    private Timestamp commetRdate;
    private String commetRemark;


    @Override
    public String toString() {
        return "TbCommentEntity{" +
                "commetId=" + commetId +
                ", commetContent='" + commetContent + '\'' +
                ", guestId=" + guestId +
                ", articleId=" + articleId +
                ", commetCdate=" + commetCdate +
                ", commetMdate=" + commetMdate +
                ", commetRdate=" + commetRdate +
                ", commetRemark='" + commetRemark + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commet_id")
    public int getCommetId() {
        return commetId;
    }

    public void setCommetId(int commetId) {
        this.commetId = commetId;
    }

    @Basic
    @Column(name = "commet_content")
    public String getCommetContent() {
        return commetContent;
    }

    public void setCommetContent(String commetContent) {
        this.commetContent = commetContent;
    }

    @Basic
    @Column(name = "guest_id")
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
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
    @Column(name = "commet_cdate")
    public Timestamp getCommetCdate() {
        return commetCdate;
    }

    public void setCommetCdate(Timestamp commetCdate) {
        this.commetCdate = commetCdate;
    }

    @Basic
    @Column(name = "commet_mdate")
    public Timestamp getCommetMdate() {
        return commetMdate;
    }

    public void setCommetMdate(Timestamp commetMdate) {
        this.commetMdate = commetMdate;
    }

    @Basic
    @Column(name = "commet_rdate")
    public Timestamp getCommetRdate() {
        return commetRdate;
    }

    public void setCommetRdate(Timestamp commetRdate) {
        this.commetRdate = commetRdate;
    }

    @Basic
    @Column(name = "commet_remark")
    public String getCommetRemark() {
        return commetRemark;
    }

    public void setCommetRemark(String commetRemark) {
        this.commetRemark = commetRemark;
    }


}
