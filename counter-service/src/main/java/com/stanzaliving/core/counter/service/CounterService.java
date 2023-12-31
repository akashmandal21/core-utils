package com.stanzaliving.core.counter.service;

import com.stanzaliving.core.counter.exceptions.CounterServiceException;
import org.springframework.stereotype.Service;

@Service
public interface CounterService {

	Long increaseCount(CategoryKey counterKey) throws CounterServiceException;
	Long increaseCountByValue(CategoryKey counterKey, Long count) throws CounterServiceException;

}
