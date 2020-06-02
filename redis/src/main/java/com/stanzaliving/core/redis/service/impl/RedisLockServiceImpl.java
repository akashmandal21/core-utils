package com.stanzaliving.core.redis.service.impl;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.redis.service.RedisLockService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class RedisLockServiceImpl implements RedisLockService {

	@Autowired
	private RedissonClient redissonClient;

	@Override
	public RLock acquire(String lockName) {

		log.info("Acquiring Lock for [" + lockName + "]");

		return redissonClient.getLock(lockName);
	}

	@Override
	public void release(RLock rLock) {
		rLock.unlock();
	}

}