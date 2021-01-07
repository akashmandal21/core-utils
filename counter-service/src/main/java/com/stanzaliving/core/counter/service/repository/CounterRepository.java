package com.stanzaliving.core.counter.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stanzaliving.core.counter.entity.CounterKeyEntity;

@Repository
public interface CounterRepository extends JpaRepository<CounterKeyEntity, Long>{

	CounterKeyEntity findByKey(String key);
}
