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
@Table(name = "comments", schema = "imooc_vedio_dev", catalog = "")
public class CommentsEntity {
    private String id;
    private String fatherCommentId;
    private String toUserId;
    private String videoId;
    private String fromUserId;
    private String comment;
    private Timestamp createTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "father_comment_id")
    public String getFatherCommentId() {
        return fatherCommentId;
    }

    public void setFatherCommentId(String fatherCommentId) {
        this.fatherCommentId = fatherCommentId;
    }

    @Basic
    @Column(name = "to_user_id")
    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    @Basic
    @Column(name = "video_id")
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @Basic
    @Column(name = "from_user_id")
    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsEntity that = (CommentsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(fatherCommentId, that.fatherCommentId) &&
                Objects.equals(toUserId, that.toUserId) &&
                Objects.equals(videoId, that.videoId) &&
                Objects.equals(fromUserId, that.fromUserId) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fatherCommentId, toUserId, videoId, fromUserId, comment, createTime);
    }
}
