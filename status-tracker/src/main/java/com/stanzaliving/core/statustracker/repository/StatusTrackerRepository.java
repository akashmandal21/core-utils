/**
 * 
 */
package com.stanzaliving.core.statustracker.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;


@Repository
public interface StatusTrackerRepository extends AbstractJpaRepository<StatusTrackerEntity, Long> {

	StatusTrackerEntity findLastByContextNameAndStatusAndContextUuidOrderByCreatedAtDesc(String contextName,String status,String contextUuid);
	
	List<StatusTrackerEntity> findByContextUuid(String contextUuid);
}
