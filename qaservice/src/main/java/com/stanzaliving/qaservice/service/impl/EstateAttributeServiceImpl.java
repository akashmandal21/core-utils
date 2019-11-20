/**
 * 
 */
package com.stanzaliving.qaservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.util.CollectionUtils;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.qaservice.entity.EstateAttributeEntity;
import com.stanzaliving.qaservice.repository.EstateAttributeRepository;
import com.stanzaliving.qaservice.service.EstateAttributeService;

/**
 * @author raj.kumar
 *
 */
@Service
public class EstateAttributeServiceImpl implements EstateAttributeService {

	@Autowired
	private EstateAttributeRepository estateAttributeRepository;
	
	@Override
	public List<EstateAttributeEntity> saveEstateAttributeList(List<EstateAttributeEntity> estateAttributeEntityList) {
		
		if(CollectionUtils.isNullOrEmpty(estateAttributeEntityList)) {
			throw new StanzaException(" Not attribute data to save ");
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
}
