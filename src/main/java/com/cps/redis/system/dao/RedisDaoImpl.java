package com.cps.redis.system.dao;

import com.cps.redis.system.model.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author Chengw on  2017/7/5 20:42
 */
@Repository
public class RedisDaoImpl implements RedisDao {

    @Autowired
    private RedisTemplate<String,Redis> redisTemplate;

    @Override
    public void save(Redis redis) {
        ValueOperations<String,Redis> valueOper = redisTemplate.opsForValue();
        valueOper.set(redis.getId(),redis);
    }

    @Override
    public Redis get(String key) {
        ValueOperations<String,Redis> valueOper = redisTemplate.opsForValue();
        return valueOper.get(key);
    }

    @Override
    public List<Redis> findAll() {
        Set<String> list = redisTemplate.keys("*");
        redisTemplate.opsForCluster();
        List<Redis> redisList = new ArrayList<>();
        for(String str :list){
            Redis redis = new Redis();
            redis.setName(str);
            redisList.add(redis);
        }
        return redisList;
    }
}
