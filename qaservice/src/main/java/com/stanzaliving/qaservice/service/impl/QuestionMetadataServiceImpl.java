package com.stanzaliving.qaservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;
import com.stanzaliving.qaservice.repository.QuestionMetadataRepository;
import com.stanzaliving.qaservice.service.QuestionMetadataService;

@Service
public class QuestionMetadataServiceImpl implements QuestionMetadataService {

	@Autowired
	QuestionMetadataRepository questionMetadataRepository;

	@Override
	public List<QuestionMetadataEntity> findAll() {
		return questionMetadataRepository.findAll();
	}

	@Override
	public Optional<QuestionMetadataEntity> findById(Long id) {
		return questionMetadataRepository.findById(id);
	}

	@Override
	public void save(QuestionMetadataEntity questionMetadata) {
		questionMetadataRepository.save(questionMetadata);
	}

}