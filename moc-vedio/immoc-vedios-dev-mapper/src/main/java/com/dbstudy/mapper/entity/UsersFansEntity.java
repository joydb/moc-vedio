package com.dbstudy.mapper.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "users_fans", schema = "imooc_vedio_dev", catalog = "")
public class UsersFansEntity {
    private String id;
    private String userId;
    private String fanId;

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
    @Column(name = "fan_id")
    public String getFanId() {
        return fanId;
    }

    public void setFanId(String fanId) {
        this.fanId = fanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersFansEntity that = (UsersFansEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(fanId, that.fanId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, fanId);
    }
}
