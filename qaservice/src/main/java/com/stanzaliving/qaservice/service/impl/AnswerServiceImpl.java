package com.stanzaliving.qaservice.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.qaservice.dto.QuestionDataDto;
import com.stanzaliving.qaservice.entity.AnswerEntity;
import com.stanzaliving.qaservice.repository.AnswerRepository;
import com.stanzaliving.qaservice.service.AnswerService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AnswerServiceImpl implements AnswerService {

	private AnswerRepository answerRepository;

	private ObjectMapper objectMapper;

	@Autowired
	public AnswerServiceImpl(AnswerRepository answerRepository, ObjectMapper objectMapper) {
		this.answerRepository = answerRepository;
		this.objectMapper = objectMapper;
	}
	
	@Override
	public AnswerEntity save(String estateId, String propertyId, Map<String, Object> answerMap) {

		AnswerEntity answer = this.findByEstateId(estateId);
		if (answer == null) {
			answer = new AnswerEntity();
		}
		
		answer.setEstateId(estateId);
		answer.setPropertyId(propertyId);
		
		try {
			answer.setAnswer(objectMapper.writeValueAsString(answerMap));
		} catch (JsonProcessingException e) {
			log.error(" Exception occurred while converting object into string ", e);
		}
		
		answerRepository.save(answer);
		
		return answer;
	}

	@Override
	public AnswerEntity findByEstateId(String estateId) {
		return answerRepository.findByEstateId(estateId);
	}

	@Override
	public Map<String, Object> getAnswerMapByEstateId(String estateId) {
		Map<String, Object> ansMap = null;
		
		try {
			
			AnswerEntity answer = this.findByEstateId(estateId);
			
			if (answer == null || StringUtils.isEmpty(answer.getAnswer())) {
				ansMap = new HashMap<>();
			} else {
				ansMap = objectMapper.readValue(answer.getAnswer(), new TypeReference<Map<String, Object>>() {});
			}
			
		} catch (Exception e) {
			log.error(" Exception occurred while fetching answer for estateId " + estateId, e);
		}
		
		return ansMap;
	}
	
	@Override
	public QuestionDataDto getAnswerMapByEstateId(String estateId, QuestionDataDto questionDataDto) {
		Map<String, Object> ansMap = null;
		
		try {
			
			AnswerEntity answer = this.findByEstateId(estateId);
			
			if (answer == null || StringUtils.isEmpty(answer.getAnswer())) {
				ansMap = new HashMap<>();
			} else {
				ansMap = objectMapper.readValue(answer.getAnswer(), new TypeReference<Map<String, Object>>() {});
			}
			
			questionDataDto.setAnswers(ansMap);
			questionDataDto.setLastUpdatedAt(answer != null ? answer.getUpdatedAt() : null);
			
		} catch (Exception e) {
			log.error(" Exception occurred while fetching answer for estateId " + estateId, e);
		}
		
		return questionDataDto;
	}

}