package cn.edu.zucc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_category", schema = "blogs", catalog = "")
public class TbCategoryEntity  implements Serializable {
    private int categoryId;
    private String categoryName;
    private Timestamp categoryCdate;
    private Timestamp categoryMdate;
    private Timestamp categoryRdate;
    private String categoryRemark;


    @Override
    public String toString() {
        return "TbCategoryEntity{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryCdate=" + categoryCdate +
                ", categoryMdate=" + categoryMdate +
                ", categoryRdate=" + categoryRdate +
                ", categoryRemark='" + categoryRemark + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
    @Column(name = "category_cdate")
    public Timestamp getCategoryCdate() {
        return categoryCdate;
    }

    public void setCategoryCdate(Timestamp categoryCdate) {
        this.categoryCdate = categoryCdate;
    }

    @Basic
    @Column(name = "category_mdate")
    public Timestamp getCategoryMdate() {
        return categoryMdate;
    }

    public void setCategoryMdate(Timestamp categoryMdate) {
        this.categoryMdate = categoryMdate;
    }

    @Basic
    @Column(name = "category_rdate")
    public Timestamp getCategoryRdate() {
        return categoryRdate;
    }

    public void setCategoryRdate(Timestamp categoryRdate) {
        this.categoryRdate = categoryRdate;
    }

    @Basic
    @Column(name = "category_remark")
    public String getCategoryRemark() {
        return categoryRemark;
    }

    public void setCategoryRemark(String categoryRemark) {
        this.categoryRemark = categoryRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCategoryEntity that = (TbCategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryCdate != null ? !categoryCdate.equals(that.categoryCdate) : that.categoryCdate != null)
            return false;
        if (categoryMdate != null ? !categoryMdate.equals(that.categoryMdate) : that.categoryMdate != null)
            return false;
        if (categoryRdate != null ? !categoryRdate.equals(that.categoryRdate) : that.categoryRdate != null)
            return false;
        if (categoryRemark != null ? !categoryRemark.equals(that.categoryRemark) : that.categoryRemark != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryCdate != null ? categoryCdate.hashCode() : 0);
        result = 31 * result + (categoryMdate != null ? categoryMdate.hashCode() : 0);
        result = 31 * result + (categoryRdate != null ? categoryRdate.hashCode() : 0);
        result = 31 * result + (categoryRemark != null ? categoryRemark.hashCode() : 0);
        return result;
    }
}
