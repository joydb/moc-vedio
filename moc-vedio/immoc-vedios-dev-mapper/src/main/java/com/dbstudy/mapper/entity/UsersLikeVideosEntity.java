package com.dbstudy.mapper.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "users_like_videos", schema = "imooc_vedio_dev", catalog = "")
public class UsersLikeVideosEntity {
    private String id;
    private String userId;
    private String videoId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "video_id")
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersLikeVideosEntity that = (UsersLikeVideosEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(videoId, that.videoId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, videoId);
    }
}
