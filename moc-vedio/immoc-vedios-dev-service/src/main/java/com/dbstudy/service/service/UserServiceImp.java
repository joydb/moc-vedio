package com.dbstudy.service.service;

import com.dbstudy.common.utils.MD5Utils;
import com.dbstudy.mapper.entity.UsersEntity;
import com.dbstudy.service.service.impl.UserService;
import com.dbstudy.mapper.jpa.UsersRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 */

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public boolean isExist(UsersEntity user)
    {
        UsersEntity findUser = usersRepository.findByUsername(user.getUsername());
        return findUser == null ? false : true;
    }

    @Override
    public UsersEntity save(UsersEntity user) {
        return usersRepository.save(user);
    }

    @Override
    public UsersEntity initUser(UsersEntity user) {
        try {
            user.setNickname(user.getUsername());
            user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
            user.setId(UUID.randomUUID().toString());
            return user;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
