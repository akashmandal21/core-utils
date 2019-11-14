package com.stanzaliving.qaservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.entity.QuestionEntity;
import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;
import com.stanzaliving.qaservice.repository.QuestionRepository;
import com.stanzaliving.qaservice.service.QuestionMetadataService;
import com.stanzaliving.qaservice.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionMetadataService questionMetadataService;

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public QuestionEntity addQuestion(QuestionRequestDto questionRequestDTO) {
		String metadata = null;
		if (null != questionRequestDTO.getMetadataId()) {
			QuestionMetadataEntity questionMetadata = questionMetadataService.findById(questionRequestDTO.getMetadataId()).orElse(null);
			if (null == questionMetadata) {
				throw new StanzaException("Unable to get metadata using id " + questionRequestDTO.getMetadataId());
			}
			metadata = questionMetadata.getMetadata();
		}

		QuestionEntity question = new QuestionEntity(questionRequestDTO);

		// TODO: Validate if metadata obtained from Table satisfies the metadata as per backend type of questions
		question.setMetadata(metadata);
		return questionRepository.save(question);
	}

	@Override
	public List<QuestionEntity> findAll() {
		return questionRepository.findAll();
	}

}