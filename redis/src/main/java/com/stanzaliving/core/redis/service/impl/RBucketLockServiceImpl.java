package com.stanzaliving.core.redis.service.impl;

import com.stanzaliving.core.redis.service.RBucketLockService;
import lombok.extern.log4j.Log4j2;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Log4j2
@Service
public class RBucketLockServiceImpl implements RBucketLockService {

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public RBucket<Object> acquire(String lockName, TimeUnit timeUnit, int count) {

        RBucket<Object> rbBucket = redissonClient.getBucket(lockName);
        try {
            if(rbBucket.trySet(0, count, timeUnit)) {
                log.info("Acquiring Lock for ["+lockName+"]");
                return rbBucket;
            }
            log.info("Lock aquisition failed for key -- {}",lockName);
        }
        catch(Exception e) {
            log.info("some error occcured while acquiring the lock {}",e);
        }
        return null;
    }

    @Override
    public void release(RBucket rBucket) {

        log.info("Releasing Lock -- {}", rBucket.getName());
        rBucket.delete();
    }
}
