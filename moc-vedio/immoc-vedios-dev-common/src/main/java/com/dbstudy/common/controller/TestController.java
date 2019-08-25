package com.dbstudy.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 */


public class TestController {

    public String testHello(){
        return "<h1>hello world!<h1>";
    }
}
