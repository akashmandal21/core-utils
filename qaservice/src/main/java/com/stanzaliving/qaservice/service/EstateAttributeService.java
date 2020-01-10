/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.List;
import java.util.Map;

import com.stanzaliving.qaservice.entity.AnswerEntity;
import com.stanzaliving.qaservice.entity.EstateAttributeEntity;

/**
 * @author raj.kumar
 *
 */
public interface EstateAttributeService {

	List<EstateAttributeEntity> saveEstateAttributeList(List<EstateAttributeEntity> estateAttributeEntityList);
	
	Map<String, EstateAttributeEntity> getEstateAttributeMap(String estateId);

	List<EstateAttributeEntity> getAndSaveEstateAttributeEntityListFromAnswer(AnswerEntity answer, String estateId,
			String propertyId);
		
}
