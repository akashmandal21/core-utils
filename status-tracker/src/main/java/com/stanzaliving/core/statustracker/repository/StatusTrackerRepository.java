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

	StatusTrackerEntity findLastByContextNameAndStatusNameAndContextUuidOrderByCreatedAtDesc(String contextName,String statusName,String contextUuid);
	
	List<StatusTrackerEntity> findByContextUuid(String contextUuid);
	
	List<StatusTrackerEntity> findByContextUuidAndStatusName(String contextUuid,String status);
	
	List<StatusTrackerEntity> findByContextUuidAndContextName(String contextUuid,String contextName);

	StatusTrackerEntity findFirstByContextUuidAndStatusNameNotInOrderByCreatedAtDesc(String contextUuid, List<String> status);
}
