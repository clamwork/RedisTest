package com.cps.redis.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author Chengw on  2017/7/6 19:13
        */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @RequestMapping( value = "/home", method = RequestMethod.POST)
    public Map<String,Object> home(){
        return null;
    }
}
