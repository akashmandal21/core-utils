/**
 * 
 */
package com.stanzaliving.qaservice.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.qaservice.entity.EstateAttributeEntity;
import com.stanzaliving.qaservice.repository.EstateAttributeRepository;
import com.stanzaliving.qaservice.service.EstateAttributeService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author raj.kumar
 *
 */
@Service
@Slf4j
public class EstateAttributeServiceImpl implements EstateAttributeService {

	@Autowired
	private EstateAttributeRepository estateAttributeRepository;
	
	@Override
	public List<EstateAttributeEntity> saveEstateAttributeList(List<EstateAttributeEntity> estateAttributeEntityList) {
		
		if(CollectionUtils.isEmpty(estateAttributeEntityList)) {
			throw new StanzaException(" No attribute data to save ");
		}
		
		List<EstateAttributeEntity> prepareEstateAttributeEntityList = new ArrayList<>();
		
		for (EstateAttributeEntity estateAttributeEntity : estateAttributeEntityList) {
			EstateAttributeEntity estateAttributeEntityDb = 
					estateAttributeRepository.findByEstateIdAndAttributeName(
					estateAttributeEntity.getEstateId(), estateAttributeEntity.getAttributeName());
			
			if (estateAttributeEntityDb == null) {
				estateAttributeEntityDb = estateAttributeEntity;
			} else {
				estateAttributeEntityDb.setAttributeValue(estateAttributeEntity.getAttributeValue());
			}
			
			prepareEstateAttributeEntityList.add(estateAttributeEntityDb);
		}
		
		return estateAttributeRepository.saveAll(prepareEstateAttributeEntityList);
	}

	@Override
	public Map<String, EstateAttributeEntity> getEstateAttributeMap(String estateId) {
		Map<String, EstateAttributeEntity> estateAttributeMap = new HashMap<>();
		
		try {
			List<EstateAttributeEntity> estateAttributeList = estateAttributeRepository.findByEstateId(estateId);
			
			if(CollectionUtils.isEmpty(estateAttributeList)) {
				return estateAttributeMap;
			}
			
			estateAttributeList.forEach(estateEntity -> {
				estateAttributeMap.put(estateEntity.getAttributeName(), estateEntity);
			});
		} catch (Exception e) {
			log.error(" Exception occurred while fetching estate attribute ", e);
		}
		
		return estateAttributeMap;
	}
}
