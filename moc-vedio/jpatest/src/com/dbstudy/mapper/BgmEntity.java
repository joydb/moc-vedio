package com.dbstudy.mapper;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */
@Entity
@Table(name = "bgm", schema = "imooc_vedio_dev", catalog = "")
public class BgmEntity {
    private String id;
    private String author;
    private String name;
    private String path;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BgmEntity bgmEntity = (BgmEntity) o;
        return Objects.equals(id, bgmEntity.id) &&
                Objects.equals(author, bgmEntity.author) &&
                Objects.equals(name, bgmEntity.name) &&
                Objects.equals(path, bgmEntity.path);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, author, name, path);
    }
}
