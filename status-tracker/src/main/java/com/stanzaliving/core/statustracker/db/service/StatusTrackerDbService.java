
/**
 * 
 */
package com.stanzaliving.core.statustracker.db.service;

import java.util.List;

import com.stanzaliving.core.sqljpa.service.AbstractJpaService;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
public interface StatusTrackerDbService extends AbstractJpaService<StatusTrackerEntity, Long> {

	StatusTrackerEntity findLastEntryForStatusAndContext(String contextName,String status,String contextUuid);

	List<StatusTrackerEntity> findByContextUuid(String contextUuid);
	
	List<StatusTrackerEntity> findByContextUuidAndStatus(String contextUuid,String status);
	
}