/**
 * 
 */
package com.stanzaliving.qaservice.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qaservice.entity.EstateAttributeEntity;

/**
 * @author raj.kumar
 *
 */
@Repository
public interface EstateAttributeRepository extends AbstractJpaRepository<EstateAttributeEntity, Long> {

	EstateAttributeEntity findByEstateIdAndAttributeName(String estateId, String attributeName);
	
	List<EstateAttributeEntity> findByEstateId(String estateId);

	List<EstateAttributeEntity> findByAttributeNameAndAttributeValue(String attributeName, String attributeValue);
}
