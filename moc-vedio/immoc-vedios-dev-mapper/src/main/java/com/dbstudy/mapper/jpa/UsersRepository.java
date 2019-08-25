package com.dbstudy.mapper.jpa;

import com.dbstudy.mapper.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/24
 */


@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    @Query(nativeQuery = true, value = "select * from users where username = ?")
    UsersEntity findByUsername(String username);
}
