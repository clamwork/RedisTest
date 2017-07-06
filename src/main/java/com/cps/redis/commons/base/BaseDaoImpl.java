package com.cps.redis.commons.base;

import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Chengw on  2017/7/6 14:33
 */
public class BaseDaoImpl<K,V extends Serializable> implements BaseDao {

    RedisTemplate<K,V> redisTemplate;

    @Override
    public void save(Serializable serializable) {
    }

    @Override
    public Serializable get(Object id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void delete(Object id) {

    }
}
