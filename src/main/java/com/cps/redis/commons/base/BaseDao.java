package com.cps.redis.commons.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Chengw on  2017/7/6 14:31
 */
public interface BaseDao<K,V extends Serializable> {

    void save(V v);

    V get(K id);

    List<V> findAll();

    void delete(K id);
}
