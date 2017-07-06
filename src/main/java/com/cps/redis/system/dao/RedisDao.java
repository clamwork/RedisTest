package com.cps.redis.system.dao;

import com.cps.redis.system.model.Redis;

import java.util.List;

/**
 * @Author Chengw on  2017/7/5 20:42
 */
public interface RedisDao {

    void save(Redis redis);

    Redis get(String key);

    List<Redis> findAll();
}
