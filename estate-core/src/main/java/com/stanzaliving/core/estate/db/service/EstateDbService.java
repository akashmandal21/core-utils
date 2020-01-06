
/**
 * 
 */
package com.stanzaliving.core.estate.db.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.util.Pair;

import com.stanzaliving.core.estate.dto.BDDashboardStatusCountDto;
import com.stanzaliving.core.estate.dto.EstateStatusCountDto;
import com.stanzaliving.core.estate.entity.EstateEntity;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.sqljpa.service.AbstractJpaService;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
public interface EstateDbService extends AbstractJpaService<EstateEntity, Long> {


	List<EstateEntity> getEstates(Set<String> uuids, List<Long> cityId, List<EstateStatus> estateStatus, String searchKey,List<Long> micromarketId);
	

	Pair<List<EstateStatusCountDto>, List<BDDashboardStatusCountDto>> findCountByStatus(
			Set<EstateEntity> estateEntities);

}