package com.stanzaliving.qaservice.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.stanzaliving.qaservice.entity.AnswerEntity;
import com.stanzaliving.qaservice.repository.AnswerRepository;
import com.stanzaliving.qaservice.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerRepository answerRepository;

	Gson gson = new Gson();

	@Override
	public AnswerEntity save(String estateId, Map<String, Object> answerMap) {

		AnswerEntity answer = this.findByEstateId(estateId);
		if (answer == null) {
			answer = new AnswerEntity();
		}
		
		answer.setEstateId(estateId);
		answer.setAnswer(gson.toJson(answerMap));
		answerRepository.save(answer);
		return answer;
	}

	@Override
	public AnswerEntity findByEstateId(String estateId) {
		return answerRepository.findByEstateId(estateId);
	}

	@Override
	public Map<String, Object> getAnswerMapByEstateId(String estateId) {
		AnswerEntity answer = this.findByEstateId(estateId);
		Map<String, Object> ansMap = null;
		
		if (answer == null || StringUtils.isEmpty(answer.getAnswer())) {
			ansMap = new HashMap<>();
		} else {
			ansMap = gson.fromJson(answer.getAnswer(), Map.class);
		}
		
		return ansMap;
	}

}