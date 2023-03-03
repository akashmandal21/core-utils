package com.stanzaliving.core.redis.service;

import org.redisson.api.RBucket;

import java.util.concurrent.TimeUnit;

public interface RBucketLockService {

    RBucket<Object> acquire(String lockName, TimeUnit timeUnit, int count);

    void release(RBucket rLock);
}
