package com.dbstudy.mapper;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "users", schema = "imooc_vedio_dev", catalog = "")
public class UsersEntity {
    private String id;
    private String username;
    private String password;
    private String faceImage;
    private String nickname;
    private Integer fansCounts;
    private Integer followCounts;
    private Integer receiveLikeCounts;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "face_image")
    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "fans_counts")
    public Integer getFansCounts() {
        return fansCounts;
    }

    public void setFansCounts(Integer fansCounts) {
        this.fansCounts = fansCounts;
    }

    @Basic
    @Column(name = "follow_counts")
    public Integer getFollowCounts() {
        return followCounts;
    }

    public void setFollowCounts(Integer followCounts) {
        this.followCounts = followCounts;
    }

    @Basic
    @Column(name = "receive_like_counts")
    public Integer getReceiveLikeCounts() {
        return receiveLikeCounts;
    }

    public void setReceiveLikeCounts(Integer receiveLikeCounts) {
        this.receiveLikeCounts = receiveLikeCounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(faceImage, that.faceImage) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(fansCounts, that.fansCounts) &&
                Objects.equals(followCounts, that.followCounts) &&
                Objects.equals(receiveLikeCounts, that.receiveLikeCounts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, password, faceImage, nickname, fansCounts, followCounts, receiveLikeCounts);
    }
}
