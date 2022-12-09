package com.stanzaliving.core.redis.service;

import org.redisson.api.RBucket;
import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

public interface RedisLockService {

	RLock acquire(String lockName);

	RLock acquireFair(String lockName);

	RBucket<Object> acquire(String lockName, TimeUnit timeUnit, int count);

	void release(RLock rLock);

}