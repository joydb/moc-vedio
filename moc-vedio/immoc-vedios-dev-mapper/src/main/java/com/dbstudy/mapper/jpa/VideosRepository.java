package com.dbstudy.mapper.jpa;

import com.dbstudy.mapper.entity.VideosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */

@Repository
public interface VideosRepository extends JpaRepository<VideosEntity,Integer> {
}
