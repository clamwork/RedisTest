package com.cps.redis.c;

import com.cps.redis.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.core.ClusterOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;

import java.util.List;
import java.util.Set;

/**
 * @Author Chengw on  2017/7/6 9:10
 */
public class RedisClusterTest extends BaseTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisClusterConfiguration redisClusterConfiguration;

    @Test
    public void cluseter(){
        Set<RedisNode> set = redisClusterConfiguration.getClusterNodes();
        for(RedisNode node :set){
            System.out.println(node);
        }
    }

    /**
     * 测试redis集群的客户端集
     */
    @Test
    public void clients(){
        List<RedisClientInfo>  clents = redisTemplate.getClientList();
        for(RedisClientInfo clientInfo :clents){
            System.out.println(clientInfo);
        }
    }

}
