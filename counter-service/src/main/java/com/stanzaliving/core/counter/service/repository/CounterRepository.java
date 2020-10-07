package com.stanzaliving.core.counter.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stanzaliving.core.counter.entity.CounterKeyEntity;

@Repository
public interface CounterRepository extends JpaRepository<CounterKeyEntity, Long>{

	@Query(value="select ck.count from #{#entityName} ck where ck.key:key for UPDATE;"
			+ "Update #{#entityName} ck set ck.count=ck.count+1 where ck.key:key", nativeQuery = true)
	Long increaseCount(@Param("key") String key);

	CounterKeyEntity findByKey(String key);

}
