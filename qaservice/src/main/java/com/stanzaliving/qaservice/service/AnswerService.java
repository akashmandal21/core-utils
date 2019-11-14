/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.Map;

import com.stanzaliving.qaservice.entity.AnswerEntity;


public interface AnswerService {

	AnswerEntity save(String estateId, Map<String, Object> answerMap);

	AnswerEntity findByEstateId(String estateId);

	Map<String, Object> getAnswerMapByEstateId(String estateId);

}