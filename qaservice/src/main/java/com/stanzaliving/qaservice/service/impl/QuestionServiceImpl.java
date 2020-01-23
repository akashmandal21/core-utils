package com.stanzaliving.qaservice.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.entity.QuestionEntity;
import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;
import com.stanzaliving.qaservice.enums.QuestionType;
import com.stanzaliving.qaservice.repository.QuestionRepository;
import com.stanzaliving.qaservice.service.QuestionMetadataService;
import com.stanzaliving.qaservice.service.QuestionService;

import lombok.extern.log4j.Log4j2;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionMetadataService questionMetadataService;

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public QuestionEntity createQuestion(QuestionRequestDto questionRequestDto) {
		
		String metadata = null;
		
		if (questionRequestDto.getMetadataId() != null) {
			
			QuestionMetadataEntity questionMetadata = questionMetadataService.findById(questionRequestDto.getMetadataId()).orElse(null);
			
			if (questionMetadata == null) {
				throw new StanzaException("Unable to get metadata using id " + questionRequestDto.getMetadataId());
			}
			
			metadata = questionMetadata.getMetadata();
		}

		QuestionEntity question = new QuestionEntity(questionRequestDto);
		question.setMetadata(metadata);
		
		return questionRepository.save(question);
	}

	@Override
	public List<QuestionEntity> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public void save(QuestionEntity questionEntity) {
		questionRepository.save(questionEntity);
	}
	
	@Override
	public void saveAll(List<QuestionRequestDto> questionRequestDtos) {
		
	
		List<QuestionEntity> questionEntities = new ArrayList<>();
		
		questionRequestDtos.forEach(questionRequest -> {
			QuestionEntity questionEntity = new QuestionEntity(questionRequest);
			questionEntity.setMetadata(questionRequest.getMetadata());
			
			questionEntities.add(questionEntity);
		});
		
		questionRepository.saveAll(questionEntities);
	}

	@Override
	public Map<Integer,Map<String, QuestionEntity>> getScreenwiseQuestionMapWithQuestionIdentifier() {
		
		Map<Integer, Map<String, QuestionEntity>> screenQuestionMap = new HashMap<>();
		List<QuestionEntity> questionList = findAll();
		
		Map<Integer, List<QuestionEntity>> quesGroupByScreen = 
													questionList.stream().collect(Collectors.groupingBy(QuestionEntity::getScreenGroupNum));
		
		quesGroupByScreen.forEach((k, v) -> {
			List<QuestionEntity> questions = v;
			Map<String, QuestionEntity> questionIdentifierMap = new HashMap<>();
			
			questions.forEach(question -> {
				questionIdentifierMap.put(question.getQuestionIdentifier(), question);
			});
			
			screenQuestionMap.put(k, questionIdentifierMap);
		});
		
		return screenQuestionMap;
	}

	@Override
	public Map<QuestionType, List<QuestionEntity>> getQuestionsByQuestionType() {
		
		List<QuestionEntity> questions = findAll();
		
		if(CollectionUtils.isNotEmpty(questions)) {
			return questions.stream().collect(Collectors.groupingBy(QuestionEntity::getQuestionType));
		}
		
		return Collections.emptyMap();

	}
}