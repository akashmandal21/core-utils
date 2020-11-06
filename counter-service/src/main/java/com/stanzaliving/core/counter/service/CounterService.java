package com.stanzaliving.core.counter.service;

import org.springframework.stereotype.Service;

@Service
public interface CounterService {

	Long increaseCount(CounterKey counterKey);

	void populateDbData(String dep, String plat);

	String getKey(String department, String platform);
		
	void test(String loopId);
}
