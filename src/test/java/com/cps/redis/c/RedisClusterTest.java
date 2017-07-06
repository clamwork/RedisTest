package com.cps.redis.c;

import com.cps.redis.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @Author Chengw on  2017/7/6 9:10
 */
public class RedisClusterTest extends BaseTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void cluseter(){
        List list = redisTemplate.exec();
        System.out.println(list);
    }
}
