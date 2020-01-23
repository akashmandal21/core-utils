/**
 * 
 */
package com.stanzaliving.qaservice.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.qaservice.entity.AnswerEntity;
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
	private ObjectMapper objectMapper;
	
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
					fetchDetailByEstateIdAndAttributeName(estateAttributeEntity.getEstateId(), estateAttributeEntity.getAttributeName());
							
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
	
	@Override
	public List<EstateAttributeEntity> getAndSaveEstateAttributeEntityListFromAnswer(AnswerEntity answer, String estateId, String propertyId) {
        Map<String, Object> answerMap = null;
        List<EstateAttributeEntity> estateAttributeEntityList = new ArrayList<>();
        
        try {
        	
        	answerMap = objectMapper.readValue(answer.getAnswer(), new TypeReference<Map<String, Object>>() {});
            
            for (Map.Entry<String, Object> entry : answerMap.entrySet()) {
                estateAttributeEntityList.add(new EstateAttributeEntity(estateId, propertyId, (String) entry.getKey(), objectMapper.writeValueAsString(entry.getValue())));
            }
            
            this.saveEstateAttributeList(estateAttributeEntityList);
            
        } catch (IOException e) {
            log.error("IO exception occured while converting answer to Map " + answer.getAnswer(), e);
        }
        
        return estateAttributeEntityList;
    }

	@Override
	public EstateAttributeEntity fetchDetailByEstateIdAndAttributeName(String estateId, String attributeName) {
		
		return estateAttributeRepository.findByEstateIdAndAttributeName(
						estateId, attributeName);
	}

	@Override
	public Map<String, EstateAttributeEntity> getEstateAttributeMapByPropertyId(String propertyId) {
		Map<String, EstateAttributeEntity> estateAttributeMap = new HashMap<>();
		
		try {
			List<EstateAttributeEntity> estateAttributeList = estateAttributeRepository.findByPropertyId(propertyId);
			
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
