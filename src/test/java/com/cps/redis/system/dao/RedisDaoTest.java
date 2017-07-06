package com.cps.redis.system.dao;

import com.cps.redis.base.BaseTest;
import com.cps.redis.system.model.Redis;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @Author Chengw on  2017/7/6 14:09
 */
public class RedisDaoTest extends BaseTest {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void saveAndGet() throws Exception {
        String uuid = UUID.randomUUID().toString();
        Redis redis = new Redis(uuid,"Test",new Date());
        redisDao.save(redis);
        System.out.println("save success");
        Redis redis1  = redisDao.get(uuid);
        System.out.println("info " + redis1);
    }

    @Test
    public void findAll(){
        List<Redis> list = redisDao.findAll();
        for(Redis redis :list){
            System.out.println("redis :" +redis);
        }
        System.out.println("redis size :" +list.size());
    }


}