package com.dbstudy.miniapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String testHello(){
        return "<h1>hello MiniApi!<h1>";
    }
}
