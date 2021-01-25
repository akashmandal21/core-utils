package com.stanzaliving.core.statustracker.service;

import java.util.List;

import com.stanzaliving.core.statustracker.dto.StatusTrackerDto;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;

public interface StatusTrackerService {

	boolean createEntryForStatus(StatusTrackerDto statusTrackerDto);

	StatusTrackerDto getLastEntryForStatus(String contextName, String status, String contextUuid);
	
	List<StatusTrackerDto> getEntryByContextNameAndContextUuid(String contextName, String contextUuid);
	
	List<StatusTrackerDto> getAllStatusTrackerRecords();

	void insertStatusTrackerInitialPropertyCreationRecord(List<StatusTrackerEntity> statusTrackerEntities);
}
