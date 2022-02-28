
/**
 * 
 */
package com.stanzaliving.core.statustracker.db.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<StatusTrackerEntity> findByContextUuid(String contextUuid) {
		return statusTrackerRepository.findByContextUuid(contextUuid);
	}

	@Override
	public List<StatusTrackerEntity> findByContextUuidAndStatus(String contextUuid, String status) {
		return statusTrackerRepository.findByContextUuidAndStatusName(contextUuid, status);
	}

	@Override
	public List<StatusTrackerEntity> findByContextUuidAndContextName(String contextUuid, String contextName) {
		return statusTrackerRepository.findByContextUuidAndContextName(contextUuid, contextName);
	}

	@Override
	public <T> Optional<T> findFirstByUuidAndStatus(String applicabilityCriteriaUuid, boolean b) {
		return Optional.empty();
	}
}