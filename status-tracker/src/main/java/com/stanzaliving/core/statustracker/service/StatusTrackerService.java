package com.stanzaliving.core.statustracker.service;

import com.stanzaliving.core.statustracker.dto.StatusTrackerDto;

public interface StatusTrackerService {

	StatusTrackerDto getLastEntryForStatus(String contextName, Enum<?> status,
			String contextUuid);
	
	boolean createEntryForStatus(StatusTrackerDto statusTrackerDto);
}
