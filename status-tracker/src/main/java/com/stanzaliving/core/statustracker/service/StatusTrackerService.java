package com.stanzaliving.core.statustracker.service;

import com.stanzaliving.core.statustracker.dto.StatusTrackerDto;

public interface StatusTrackerService {

	boolean createEntryForStatus(StatusTrackerDto statusTrackerDto);

	StatusTrackerDto getLastEntryForStatus(String contextName, String status, String contextUuid);
}
