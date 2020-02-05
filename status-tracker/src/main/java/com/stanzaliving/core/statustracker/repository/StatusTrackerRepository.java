/**
 * 
 */
package com.stanzaliving.core.statustracker.repository;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;


@Repository
public interface StatusTrackerRepository extends AbstractJpaRepository<StatusTrackerEntity, Long> {

	StatusTrackerEntity findLastByContextNameAndStatusAndContextUuidOrderByCreatedAtDesc(String contextName,Enum<?> status,String contextUuid);
	
}
