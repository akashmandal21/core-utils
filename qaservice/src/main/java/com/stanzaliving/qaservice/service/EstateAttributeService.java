/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.List;

import com.stanzaliving.qaservice.entity.EstateAttributeEntity;

/**
 * @author raj.kumar
 *
 */
public interface EstateAttributeService {

	List<EstateAttributeEntity> saveEstateAttributeList(List<EstateAttributeEntity> estateAttributeEntityList);
}
