/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.List;
import java.util.Optional;

import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
**/
public interface QuestionMetadataService {

	List<QuestionMetadataEntity> findAll();

	Optional<QuestionMetadataEntity> findById(Long id);

	void save(QuestionMetadataEntity questionMetadata);

}