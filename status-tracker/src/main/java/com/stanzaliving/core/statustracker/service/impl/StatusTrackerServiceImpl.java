package com.stanzaliving.core.statustracker.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.statustracker.db.service.StatusTrackerDbService;
import com.stanzaliving.core.statustracker.dto.StatusTrackerDto;
import com.stanzaliving.core.statustracker.entity.StatusTrackerEntity;
import com.stanzaliving.core.statustracker.service.StatusTrackerService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StatusTrackerServiceImpl implements StatusTrackerService {

	@Autowired
	private StatusTrackerDbService statusTrackerDbService;
	
	@Override
	public StatusTrackerDto getLastEntryForStatus(String contextName, String status, String contextUuid) {
		
		log.info("Got request to get entry sttaus ["+contextName+"] status ["+status+"] contextUuid ["+contextUuid+"]");
		
		StatusTrackerEntity statusTrackerEntity = statusTrackerDbService.findLastEntryForStatusAndContext(contextName, status, contextUuid);
		
		if(Objects.nonNull(statusTrackerEntity)) {
			return StatusTrackerDto.builder().contextName(statusTrackerEntity.getContextName())
					.contextUuid(statusTrackerEntity.getContextUuid()).createdAt(statusTrackerEntity.getCreatedAt())
					.createdBy(statusTrackerEntity.getCreatedBy()).status(statusTrackerEntity.getStatus()).build();
		}
		
		return null;
	}

	@Override
	public boolean createEntryForStatus(StatusTrackerDto statusTrackerDto) {
		
		if(Objects.isNull(statusTrackerDto)) {
			return false;
		}
		
		log.info("statusTrackerDto to save ["+statusTrackerDto+"]");
		
		StatusTrackerEntity statusTrackerEntity = StatusTrackerEntity.builder().contextName(statusTrackerDto.getContextName())
									.contextUuid(statusTrackerDto.getContextUuid())
									.createdBy(statusTrackerDto.getCreatedBy())
									.status(statusTrackerDto.getStatus()).build();
		try {
			statusTrackerEntity = statusTrackerDbService.save(statusTrackerEntity);	
		}catch(Exception e) {
			log.error("Got error while saving status");
			
			return false;
		}
		
		return Objects.nonNull(statusTrackerEntity);
	}
}
