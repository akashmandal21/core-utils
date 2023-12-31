/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.Map;

import com.stanzaliving.qaservice.dto.QuestionDataDto;
import com.stanzaliving.qaservice.entity.AnswerEntity;


public interface AnswerService {

	AnswerEntity save(String estateId, String propertyId, Map<String, Object> answerMap);

	AnswerEntity findByEstateId(String estateId);

	Map<String, Object> getAnswerMapByEstateId(String estateId);

	QuestionDataDto getAnswerMapByEstateId(String estateId, QuestionDataDto questionDataDto);

}