package cn.edu.zucc.model;

import javax.persistence.*;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_guest", schema = "blogs", catalog = "")
public class TbGuestEntity {
    private int guestId;
    private String guestName;
    private String guestEmail;
    private Integer guestRss;

    @Id
    @Column(name = "guest_id")
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    @Basic
    @Column(name = "guest_name")
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Basic
    @Column(name = "guest_email")
    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    @Basic
    @Column(name = "guest_rss")
    public Integer getGuestRss() {
        return guestRss;
    }

    public void setGuestRss(Integer guestRss) {
        this.guestRss = guestRss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbGuestEntity that = (TbGuestEntity) o;

        if (guestId != that.guestId) return false;
        if (guestName != null ? !guestName.equals(that.guestName) : that.guestName != null) return false;
        if (guestEmail != null ? !guestEmail.equals(that.guestEmail) : that.guestEmail != null) return false;
        if (guestRss != null ? !guestRss.equals(that.guestRss) : that.guestRss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guestId;
        result = 31 * result + (guestName != null ? guestName.hashCode() : 0);
        result = 31 * result + (guestEmail != null ? guestEmail.hashCode() : 0);
        result = 31 * result + (guestRss != null ? guestRss.hashCode() : 0);
        return result;
    }
}
