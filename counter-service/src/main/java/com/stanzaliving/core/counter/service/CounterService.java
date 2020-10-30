package com.stanzaliving.core.counter.service;

import org.springframework.stereotype.Service;

@Service
public interface CounterService {

	Long increaseCount(CounterKey counterKey);
		
}
