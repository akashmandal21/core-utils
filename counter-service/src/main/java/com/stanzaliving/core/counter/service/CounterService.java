package com.stanzaliving.core.counter.service;

import com.stanzaliving.core.counter.exceptions.CounterServiceException;

public interface CounterService {

	Long increaseCount(CategoryKey counterKey) throws CounterServiceException;
	Long increaseCountByValue(String key, Long count) throws CounterServiceException;

}
