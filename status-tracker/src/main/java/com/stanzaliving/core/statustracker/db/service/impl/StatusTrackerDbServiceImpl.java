
/**
 * 
 */
package com.stanzaliving.core.statustracker.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.sqljpa.service.impl.AbstractJpaServiceImpl;
import com.stanzaliving.core.statustracker.db.service.StatusTrackerDbService;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;
import com.stanzaliving.core.statustracker.repository.StatusTrackerRepository;

@Service
public class StatusTrackerDbServiceImpl extends AbstractJpaServiceImpl<StatusTrackerEntity, Long, StatusTrackerRepository> implements StatusTrackerDbService {

	@Autowired
	private StatusTrackerRepository statusTrackerRepository;

	@Override
	protected StatusTrackerRepository getJpaRepository() {
		return statusTrackerRepository;
	}

	@Override
	public StatusTrackerEntity findLastEntryForStatusAndContext(String contextName, String status,
			String contextUuid) {
		return statusTrackerRepository.findLastByContextNameAndStatusNameAndContextUuidOrderByCreatedAtDesc(contextName, status, contextUuid);
	}

}