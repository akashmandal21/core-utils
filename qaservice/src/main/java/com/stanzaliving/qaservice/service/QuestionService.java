/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.List;
import java.util.Map;

import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.entity.QuestionEntity;
import com.stanzaliving.qaservice.enums.QuestionType;


public interface QuestionService {

	Map<Integer,Map<String, QuestionEntity>> getScreenwiseQuestionMapWithQuestionIdentifier();
	
	QuestionEntity createQuestion(QuestionRequestDto questionRequestDto);

	List<QuestionEntity> findAll();
	
	void save(QuestionEntity questionEntity);

	void saveAll(List<QuestionRequestDto> questionRequestDtos);
	
	Map<QuestionType,List<QuestionEntity>> getQuestionsByQuestionType();
}