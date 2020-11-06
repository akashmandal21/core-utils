package com.stanzaliving.core.counter.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.counter.entity.CounterKeyEntity;
import com.stanzaliving.core.counter.service.CounterKey;
import com.stanzaliving.core.counter.service.CounterService;
import com.stanzaliving.core.counter.service.repository.CounterRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CounterServiceImpl implements CounterService{

	@Autowired
	private CounterRepository countRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
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

	@Override
	public void populateDbData(String dep, String plat) {
		
		for(int i=1;i<=10000;i++) {
			
			CounterKeyEntity countEntity = new CounterKeyEntity();
			countEntity.setCount(i);
			String counterKey = dep.concat("_").concat(plat).concat("_").concat(""+i);
			countEntity.setKey(counterKey);
			countRepository.save(countEntity);
		}
		
	}

	@Override
	public String getKey(String department, String platform) {
		
		

		String categoryKey = department.concat("_").concat(platform);
		Query query = entityManager.createQuery("select c from counter_key c where c.key = :categoryKey and c.status=1");
		query.setParameter("categoryKey", categoryKey);
		query.setLockMode(LockModeType.PESSIMISTIC_WRITE);
		CounterKeyEntity counterKeyEntity = ((CounterKeyEntity) query.setMaxResults(1).getSingleResult());
		counterKeyEntity.setStatus(false);
		
		
		return counterKeyEntity.getCount()+"";
	}
	
	
	public void test(String loopId) {
		if(loopId.equals("TH"))
			test1();
		else {
			List<String> key = new ArrayList<>();

			for (int i = 0; i < 50000; i++) {
				key.add(getKey("TH", "NC"));
			}

			key.forEach(k -> {
				log.info(loopId + "-" + k);
			});
		}
		
	}

	public void test1() {

		for(int i=0;i<100000;i++){
			countRepository.save(CounterKeyEntity.builder().count(i).key("TH_NC").build());
		}

	}

	

}
