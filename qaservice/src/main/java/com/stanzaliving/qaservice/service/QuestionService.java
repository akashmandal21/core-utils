/**
 * 
 */
package com.stanzaliving.qaservice.service;

import java.util.List;

import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.entity.QuestionEntity;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
**/
public interface QuestionService {

	QuestionEntity addQuestion(QuestionRequestDto questionRequestDTO);

	List<QuestionEntity> findAll();
	
	void save(QuestionEntity questionEntity);

	void saveAll(List<QuestionRequestDto> questionRequestDtos);
}