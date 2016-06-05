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
    private int guestRss;

    @Override
    public String toString() {
        return "TbGuestEntity{" +
                "guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                ", guestRss=" + guestRss +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public int getGuestRss() {
        return guestRss;
    }

    public void setGuestRss(int guestRss) {
        this.guestRss = guestRss;
    }


}
