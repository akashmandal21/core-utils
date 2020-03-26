package com.stanzaliving.core.statustracker.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections.CollectionUtils;
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

		log.info("Got request to get entry sttaus [" + contextName + "] status [" + status + "] contextUuid ["
				+ contextUuid + "]");
		


		log.info("Got request to get entry sttaus [" + contextName + "] status [" + status + "] contextUuid ["
				+ contextUuid + "]");

		List<StatusTrackerEntity> statusTrackerEntities = statusTrackerDbService.findByContextUuidAndStatus(contextUuid, status);

		if (CollectionUtils.isNotEmpty(statusTrackerEntities)) {

			Collections.sort(statusTrackerEntities, Comparator.comparing(StatusTrackerEntity::getCreatedAt, Comparator.reverseOrder()));
			
			StatusTrackerEntity statusTrackerEntity = statusTrackerEntities.get(0);

			return StatusTrackerDto.builder().contextName(statusTrackerEntity.getContextName())
					.contextUuid(statusTrackerEntity.getContextUuid()).createdAt(statusTrackerEntity.getCreatedAt())
					.createdBy(statusTrackerEntity.getCreatedBy()).status(statusTrackerEntity.getStatusName())
					.build();
 
		}

		return null;
	

	}

	@Override
	public boolean createEntryForStatus(StatusTrackerDto statusTrackerDto) {

		if (Objects.isNull(statusTrackerDto)) {
			return false;
		}

		log.info("statusTrackerDto to save [" + statusTrackerDto + "]");

		StatusTrackerEntity statusTrackerEntity = StatusTrackerEntity.builder()
				.contextName(statusTrackerDto.getContextName()).contextUuid(statusTrackerDto.getContextUuid())
				.createdBy(statusTrackerDto.getCreatedBy()).statusName(statusTrackerDto.getStatus()).build();
		try {
			statusTrackerEntity = statusTrackerDbService.save(statusTrackerEntity);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Got error while saving status");

			return false;
		}

		return Objects.nonNull(statusTrackerEntity);
	}

	@Override
	public List<StatusTrackerDto> getEntryByContextNameAndContextUuid(String contextName, String contextUuid) {
		
		List<StatusTrackerEntity> statusTrackerEntities = 
				statusTrackerDbService.findByContextUuidAndContextName(contextUuid, contextName);
		
		List<StatusTrackerDto> statusTrackerDtoList = new ArrayList<>();
		
		for(StatusTrackerEntity statusTrackerEntity : statusTrackerEntities) {
			StatusTrackerDto statusTrackerDto = 
					StatusTrackerDto.builder().contextName(statusTrackerEntity.getContextName())
					.contextUuid(statusTrackerEntity.getContextUuid()).createdAt(statusTrackerEntity.getCreatedAt())
					.createdBy(statusTrackerEntity.getCreatedBy()).status(statusTrackerEntity.getStatusName())
					.build();
			
			statusTrackerDtoList.add(statusTrackerDto);
		}
		
 		return statusTrackerDtoList;
	}

	@Override
	public List<StatusTrackerDto> getAllStatusTrackerRecords() {
		List<StatusTrackerEntity> statusTrackerEntities = 
				statusTrackerDbService.findAll();
		
		List<StatusTrackerDto> statusTrackerDtoList = new ArrayList<>();
		
		for(StatusTrackerEntity statusTrackerEntity : statusTrackerEntities) {
			StatusTrackerDto statusTrackerDto = 
					StatusTrackerDto.builder().contextName(statusTrackerEntity.getContextName())
					.contextUuid(statusTrackerEntity.getContextUuid()).createdAt(statusTrackerEntity.getCreatedAt())
					.createdBy(statusTrackerEntity.getCreatedBy()).status(statusTrackerEntity.getStatusName())
					.build();
			
			statusTrackerDtoList.add(statusTrackerDto);
		}
		
 		return statusTrackerDtoList;
	}
	
	@Override
	public void insertStatusTrackerInitialPropertyCreationRecord(List<StatusTrackerEntity> statusTrackerEntities) {
		
		if(CollectionUtils.isNotEmpty(statusTrackerEntities))
			statusTrackerDbService.saveAll(statusTrackerEntities);
	}
}
