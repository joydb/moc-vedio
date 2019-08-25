package com.dbstudy.mapper.jpa;

import com.dbstudy.mapper.entity.CommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */

@Repository
public interface CommentsRepository extends JpaRepository<CommentsEntity,Integer> ,JpaSpecificationExecutor<CommentsEntity> {
}
