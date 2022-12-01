package com.stanzaliving.core.redis.service.impl;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.redis.service.RedisLockService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class RedisLockServiceImpl implements RedisLockService {

	private static final Logger logger = LoggerFactory.getLogger(RedisLockServiceImpl.class);

	@Autowired
	private RedissonClient redissonClient;

	@Override
	public RLock acquire(String lockName) {

		log.info("Acquiring Lock for [{}]", lockName);

		return redissonClient.getLock(lockName);
	}

	@Override
	public RLock acquireFair(String lockName) {

		log.info("Acquiring Fair Lock for [{}]", lockName);

		return redissonClient.getFairLock(lockName);
	}

	@Override
	public void release(RLock rLock) {

		if (Objects.isNull(rLock)) {
			log.warn("Lock is null to release");
			return;
		}
		if (rLock.isLocked()) {
			log.info("Releasing lock for: {}", rLock.getName());
			rLock.unlock();
		}
	}

	@Override
	public RBucket<Object> acquire(String lockName, TimeUnit timeUnit, int count) {

		RBucket<Object> rbBucket = redissonClient.getBucket(lockName);
		try {
			if(rbBucket.trySet(0, count, timeUnit)) {
				logger.info("Acquiring Lock for ["+lockName+"]");
				return rbBucket;
			}
			logger.info("Lock aquisition failed for key -- {}",lockName);
		}
		catch(Exception e) {
			logger.info("some error occcured while acquiring the lock {}",e);
		}
		return null;
	}

}