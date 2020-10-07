package com.stanzaliving.core.counter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.stanzaliving.core.counter.entity.CounterKeyEntity;
import com.stanzaliving.core.counter.service.CounterKey;
import com.stanzaliving.core.counter.service.CounterService;
import com.stanzaliving.core.counter.service.repository.CounterRepository;

public class CounterServiceImpl implements CounterService{

	@Autowired
	private CounterRepository countRepository;
	
	@Override
	public Long increaseCount(CounterKey counterKey) {
		
		String key = counterKey.getKey();
		
		CounterKeyEntity count = countRepository.findByKey(key);
		
		if(count.getKey()!=null)
		return countRepository.increaseCount(key);
		else {
			return null;
		}
		
	}

	

}
