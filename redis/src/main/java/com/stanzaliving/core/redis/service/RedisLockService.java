package com.stanzaliving.core.redis.service;

import org.redisson.api.RLock;

public interface RedisLockService {

	RLock acquire(String lockName);

	RLock acquireFair(String lockName);

	void release(RLock rLock);

}