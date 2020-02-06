package com.stanzaliving.core.statustracker.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

		List<StatusTrackerEntity> statusTrackerEntities = statusTrackerDbService.findByContextUuid(contextUuid);

		if (CollectionUtils.isNotEmpty(statusTrackerEntities)) {

			Optional<StatusTrackerEntity> optionalEntity = statusTrackerEntities.stream()
					.filter(entity -> entity.getStatusName().equals(status))
					.sorted(Comparator.comparing(StatusTrackerEntity::getCreatedBy, Comparator.reverseOrder()))
					.findFirst();

			if (optionalEntity.isPresent()) {
				StatusTrackerEntity statusTrackerEntity = optionalEntity.get();

				return StatusTrackerDto.builder().contextName(statusTrackerEntity.getContextName())
						.contextUuid(statusTrackerEntity.getContextUuid()).createdAt(statusTrackerEntity.getCreatedAt())
						.createdBy(statusTrackerEntity.getCreatedBy()).status(statusTrackerEntity.getStatusName())
						.build();

			}
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
}
