package com.cps.redis.node;

import com.cps.redis.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisClusterNode;
import org.springframework.data.redis.connection.RedisNode;

import java.util.Set;

/**
 * @Author Chengw on  2017/7/6 21:52
 */
public class RedisNodeTest extends BaseTest {

    @Autowired
    private RedisClusterConfiguration redisClusterConfiguration;

    /**
     * 节点信息
     */
    @Test
    public void listNodes(){
        Set<RedisNode> set = redisClusterConfiguration.getClusterNodes();
        for(RedisNode node :set){
            System.out.println(node);
        }
    }
}
