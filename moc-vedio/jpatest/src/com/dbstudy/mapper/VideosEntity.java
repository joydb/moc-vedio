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
@Table(name = "videos", schema = "imooc_vedio_dev", catalog = "")
public class VideosEntity {
    private String id;
    private String userId;
    private String audioId;
    private String videoDesc;
    private String videoPath;
    private Double videoSeconds;
    private Integer videoWidth;
    private Integer videoHeight;
    private String coverPath;
    private long likeCounts;
    private int status;
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
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "audio_id")
    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId;
    }

    @Basic
    @Column(name = "video_desc")
    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    @Basic
    @Column(name = "video_path")
    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    @Basic
    @Column(name = "video_seconds")
    public Double getVideoSeconds() {
        return videoSeconds;
    }

    public void setVideoSeconds(Double videoSeconds) {
        this.videoSeconds = videoSeconds;
    }

    @Basic
    @Column(name = "video_width")
    public Integer getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    @Basic
    @Column(name = "video_height")
    public Integer getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    @Basic
    @Column(name = "cover_path")
    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    @Basic
    @Column(name = "like_counts")
    public long getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(long likeCounts) {
        this.likeCounts = likeCounts;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        VideosEntity that = (VideosEntity) o;
        return likeCounts == that.likeCounts &&
                status == that.status &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(audioId, that.audioId) &&
                Objects.equals(videoDesc, that.videoDesc) &&
                Objects.equals(videoPath, that.videoPath) &&
                Objects.equals(videoSeconds, that.videoSeconds) &&
                Objects.equals(videoWidth, that.videoWidth) &&
                Objects.equals(videoHeight, that.videoHeight) &&
                Objects.equals(coverPath, that.coverPath) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, audioId, videoDesc, videoPath, videoSeconds, videoWidth, videoHeight, coverPath, likeCounts, status, createTime);
    }
}
