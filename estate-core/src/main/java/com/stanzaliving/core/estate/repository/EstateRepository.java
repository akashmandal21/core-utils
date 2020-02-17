/**
 * 
 */
package com.stanzaliving.core.estate.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.estate.entity.EstateEntity;
import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;


@Repository
public interface EstateRepository extends AbstractJpaRepository<EstateEntity, Long> {

	List<EstateEntity> findByEstateName(String estateName);
}