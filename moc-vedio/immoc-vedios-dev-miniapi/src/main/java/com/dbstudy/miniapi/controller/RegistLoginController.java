package com.dbstudy.miniapi.controller;

import com.dbstudy.common.utils.ImocResponse;
import com.dbstudy.mapper.entity.UsersEntity;
import com.dbstudy.service.service.impl.UserService;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 *  用户的注册和登陆页面的请求信息
 */

@Slf4j
@RestController
public class RegistLoginController {

    @Autowired
    private UserService userService;


    /**
     * @param user 用户输入(用户名+密码)注册
     */
    @RequestMapping(value = "/regist",method=RequestMethod.POST)
    ResponseEntity<ImocResponse> userRegist(UsersEntity user){
        log.info("Current registered user,username:{} and password{}",user.getUsername(),user.getPassword());
        //1.判断用户输入是否正确
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            ImocResponse response=new ImocResponse();
            response.setErrorMsg("用户名和密码不能为空！！！");
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
        //2.判断用户是否存在
        boolean isExist=userService.isExist(user);
        if (isExist){
            ImocResponse response=new ImocResponse();
            response.setErrorMsg("用户已存在！！！");
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
        UsersEntity regUser=userService.initUser(user);
        //3.保存用户注册信息
        userService.save(regUser);
        ImocResponse response=new ImocResponse();
        regUser.setPassword(null);
        response.setEntity(regUser);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
