package com.dbstudy.mapper.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "search_records", schema = "imooc_vedio_dev", catalog = "")
public class SearchRecordsEntity {
    private String id;
    private String content;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchRecordsEntity that = (SearchRecordsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, content);
    }
}
