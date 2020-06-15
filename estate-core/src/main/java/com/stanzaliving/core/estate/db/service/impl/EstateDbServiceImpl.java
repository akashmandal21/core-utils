
/**
 * 
 */
package com.stanzaliving.core.estate.db.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.estate.db.service.EstateDbService;
import com.stanzaliving.core.estate.dto.BDDashboardStatusCountDto;
import com.stanzaliving.core.estate.dto.EstateStatusCountDto;
import com.stanzaliving.core.estate.entity.EstateEntity;
import com.stanzaliving.core.estate.enums.BDDashboardStatus;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.estate.repository.EstateRepository;
import com.stanzaliving.core.sqljpa.service.impl.AbstractJpaServiceImpl;
import com.stanzaliving.core.sqljpa.specification.utils.CriteriaOperation;
import com.stanzaliving.core.sqljpa.specification.utils.StanzaSpecificationBuilder;

@Service
@Log4j2
public class EstateDbServiceImpl extends AbstractJpaServiceImpl<EstateEntity, Long, EstateRepository> implements EstateDbService {

	@Autowired
	private EstateRepository estateRepository;

	@Override
	protected EstateRepository getJpaRepository() {
		return estateRepository;
	}

	@Override
	public List<EstateEntity> getEstates(Set<String> uuids, List<Long> cityId, List<EstateStatus> estateStatus, String searchKey,List<Long> microMarketId) {

		StanzaSpecificationBuilder<EstateEntity> stanzaSpecificationBuilder = new StanzaSpecificationBuilder<>();

		if (CollectionUtils.isEmpty(uuids) && CollectionUtils.isEmpty(cityId) && CollectionUtils.isEmpty(microMarketId)) {
			throw new StanzaException("Either of uuids, cityId or microMarketId must be specified " + uuids + cityId + microMarketId);
		}

		if (CollectionUtils.isNotEmpty(uuids)) {
			stanzaSpecificationBuilder = stanzaSpecificationBuilder.with("uuid", CriteriaOperation.IN, uuids);
		}

		if (CollectionUtils.isNotEmpty(cityId)) {
			stanzaSpecificationBuilder = stanzaSpecificationBuilder.with("cityId", CriteriaOperation.IN, cityId);
		}

		if (CollectionUtils.isNotEmpty(microMarketId)) {
			stanzaSpecificationBuilder = stanzaSpecificationBuilder.with("micromarketId", CriteriaOperation.IN, microMarketId);
		}
		
		if (CollectionUtils.isNotEmpty(estateStatus)) {
			stanzaSpecificationBuilder = stanzaSpecificationBuilder.with("estateStatus", CriteriaOperation.IN, estateStatus);
		}

		if (StringUtils.isNotEmpty(searchKey)) {
			stanzaSpecificationBuilder = stanzaSpecificationBuilder.with("estateName", CriteriaOperation.LIKE, "%" + searchKey + "%");
		}

		return estateRepository.findAll(stanzaSpecificationBuilder.build(),Sort.by(Direction.DESC, "createdAt"));
	}

	@Override
	public Pair<List<EstateStatusCountDto>,List<BDDashboardStatusCountDto>> findCountByStatus(Set<EstateEntity> estateEntities) {
		
		
		
		if(CollectionUtils.isEmpty(estateEntities)) {
			return Pair.of(Collections.emptyList(), Collections.emptyList());
		}
		
		Map<EstateStatus, Long> statusCount = estateEntities.stream().collect(Collectors.groupingBy(EstateEntity::getEstateStatus, Collectors.counting()));

//		estateEntities.forEach(f->log.info("Status {} BDDash {}",f.getEstateStatus(),BDDashboardStatus.statusMap.get(f.getEstateStatus())));

		Map<BDDashboardStatus, Long> bdDashboardStatusMap = estateEntities.stream().map(EstateEntity::getEstateStatus)
																					.map(status -> BDDashboardStatus.statusMap.get(status))
																					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<EstateStatusCountDto> statusCountDtos = new ArrayList<>(statusCount.size());
		
		for (Entry<EstateStatus, Long> estateEntity : statusCount.entrySet()) {
			statusCountDtos.add(EstateStatusCountDto.builder().count(estateEntity.getValue())
					.estateStatus(estateEntity.getKey()).name(estateEntity.getKey().getName()).build());
		}
		
		List<BDDashboardStatusCountDto> dashboardStatusCountDtos = new ArrayList<>(bdDashboardStatusMap.size());
		
		for (Entry<BDDashboardStatus, Long> bdDashboardStatusEntry : bdDashboardStatusMap.entrySet()) {
			
			double percentage = StanzaUtils.findPercentage(estateEntities.size(), bdDashboardStatusEntry.getValue());
			
			dashboardStatusCountDtos.add(BDDashboardStatusCountDto.builder()
																	.status(bdDashboardStatusEntry.getKey()).count(bdDashboardStatusEntry.getValue())
																	.percentage(percentage).color(bdDashboardStatusEntry.getKey().getColor()).name(bdDashboardStatusEntry.getKey().getStatus()).build());
			
		}
		
		return Pair.of(statusCountDtos, dashboardStatusCountDtos);
	}

	@Override
	public List<EstateEntity> findByEstateName(String estateName) {
		return estateRepository.findByEstateName(estateName);
	}


}