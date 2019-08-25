package com.dbstudy.mapper;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "users_report", schema = "imooc_vedio_dev", catalog = "")
public class UsersReportEntity {
    private String id;
    private String dealUserId;
    private String dealVideoId;
    private String title;
    private String content;
    private String userid;
    private Timestamp createDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "deal_user_id")
    public String getDealUserId() {
        return dealUserId;
    }

    public void setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId;
    }

    @Basic
    @Column(name = "deal_video_id")
    public String getDealVideoId() {
        return dealVideoId;
    }

    public void setDealVideoId(String dealVideoId) {
        this.dealVideoId = dealVideoId;
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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersReportEntity that = (UsersReportEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dealUserId, that.dealUserId) &&
                Objects.equals(dealVideoId, that.dealVideoId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dealUserId, dealVideoId, title, content, userid, createDate);
    }
}
