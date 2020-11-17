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
		log.info("Key {}",key);
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
		log.info(CounterKeyEntity.builder().key(categoryKey.getKey()).count(categoryKey.getInitialValue()).build());
		return countRepository.save(CounterKeyEntity.builder().key(categoryKey.getKey()).count(categoryKey.getInitialValue()).build());
	}

}
