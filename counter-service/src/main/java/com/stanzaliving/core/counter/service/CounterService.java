package com.stanzaliving.core.counter.service;

import com.stanzaliving.core.counter.exceptions.CounterServiceException;
import org.springframework.stereotype.Service;

@Service
public interface CounterService {

	Long increaseCount(CategoryKey counterKey) throws CounterServiceException;

//	void populateDbData(String dep, String plat);

//	String getKey(String department, String platform);
		
//	void testHello(String loopId) throws InterruptedException;
}
