package com.stanzaliving.core.counter.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.counter.exceptions.CounterServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.counter.entity.CounterKeyEntity;
import com.stanzaliving.core.counter.service.CategoryKey;
import com.stanzaliving.core.counter.service.CounterService;
import com.stanzaliving.core.counter.service.repository.CounterRepository;

import lombok.extern.log4j.Log4j2;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.Objects;

@Service
@Log4j2
public class CounterServiceImpl implements CounterService{

	@Autowired
	private CounterRepository countRepository;
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	@Transactional
	public Long increaseCount(CategoryKey categoryKey) throws CounterServiceException {
		
		String key = categoryKey.getKey();
		
		CounterKeyEntity count = countRepository.findByKey(key);

		if(Objects.isNull(count))
		{
			try {
				count = createCategoryRow(categoryKey);
			}catch (Exception ex){
				log.error("Error creating the category, checking if it's created by some other transaction {}",categoryKey,ex);
				count = countRepository.findByKey(key);
				if(Objects.isNull(count))
					throw new CounterServiceException("Unable to create new category row "+categoryKey.getKey()+"  "+ex.getMessage()+" "+ex.getCause());
			}
		}
		return incrementCounterForKey(count);
	}

	@Retryable(value = javax.persistence.PersistenceException.class)
	@Transactional
	private Long incrementCounterForKey(CounterKeyEntity counterKeyEntity){
		Query query = entityManager.createNativeQuery("SELECT count_down FROM counter_key WHERE id = "+counterKeyEntity.getId()+" FOR UPDATE");
		Long count = ((BigInteger) query.getSingleResult()).longValue();
		Query update = entityManager.createNativeQuery("Update counter_key  SET count_down = count_down + 1 where id="+counterKeyEntity.getId()+"");
		update.executeUpdate();
		return count;
	}


	@Transactional
	private CounterKeyEntity createCategoryRow(CategoryKey categoryKey){
		return countRepository.save(CounterKeyEntity.builder().key(categoryKey.getKey()).count(categoryKey.getInitialValue()).build());
	}

//
////	@Transactional
//
//
////	@Override
////	public void populateDbData(String dep, String plat) {
////
////		for(int i=1;i<=10000;i++) {
////
////			CounterKeyEntity countEntity = new CounterKeyEntity();
////			countEntity.setCount(i);
////			String counterKey = dep.concat("_").concat(plat).concat("_").concat(""+i);
////			countEntity.setKey(counterKey);
////			countRepository.save(countEntity);
////		}
////
////	}
//
//	@Override
//	@Transactional
//	public String getKey(String department, String platform) {
//
//		String categoryKey = department.concat("_").concat(platform);
//		Query query = entityManager.createQuery("SELECT count FROM counter_key WHERE id = (SELECT id FROM counter_key where status=1 limit 1 order by id asc) FOR UPDATE",Integer.class);
//
//		Integer count = (Integer) query.getSingleResult();
//
//		Query update = entityManager.createNativeQuery("Update counter_key SET status = counter_field + 1");
//
//		return count+"";
//	}
//
//
//	public void testAgain(Long id){
//
//	}
//	@Retryable(value = javax.persistence.PersistenceException.class)
//	@Transactional
//	public void testHello(String loopId) throws InterruptedException {
//
//		Query query = entityManager.createNativeQuery("SELECT count_down FROM counter_key WHERE id = "+loopId+" FOR UPDATE");
//
//		Integer count = (Integer) query.getSingleResult();
//		log.info("pre "+count);
//		Thread.sleep(5000);
//		Query update = entityManager.createNativeQuery("Update counter_key  SET count_down = count_down + 1 where id="+loopId+"");
//
//		update.executeUpdate();
//		log.info("post "+count);
//
////		CounterKeyEntity ent = countRepository.findById(15001L).get();
////		ent.setCount(100);
////		countRepository.save(ent);
////		if(loopId.equals("TH"))
////			test1();
////		else {
////			List<String> key = new ArrayList<>();
////			try {
////
////
////				for (int i = 0; i < 5000; i++) {
////					key.add(getKey("TH", "NC"));
////				}
////			}catch (Exception ex){
////				log.error("Exception ",ex);
////			}
////
////			key.forEach(k -> {
////				log.info(loopId + "-" + k);
////			});
////		}
//
//	}
//
//	public void test1() {
//
//		for(int i=0;i<100000;i++){
//			countRepository.save(CounterKeyEntity.builder().count(i).key("TH_NC").build());
//		}
//
//	}

}
