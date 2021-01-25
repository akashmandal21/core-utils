package com.stanzaliving.qaservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.qaservice.dto.QuestionMetadataDto;
import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;
import com.stanzaliving.qaservice.repository.QuestionMetadataRepository;
import com.stanzaliving.qaservice.service.QuestionMetadataService;

@Service
public class QuestionMetadataServiceImpl implements QuestionMetadataService {

	private QuestionMetadataRepository questionMetadataRepository;

	@Autowired
	public QuestionMetadataServiceImpl(QuestionMetadataRepository questionMetadataRepository) {
		this.questionMetadataRepository = questionMetadataRepository;
	}
	
	@Override
	public List<QuestionMetadataDto> findAll() {
		List<QuestionMetadataEntity> metaDataEntity = questionMetadataRepository.findAll();
		List<QuestionMetadataDto> metaDataList = new ArrayList<>();
		
		metaDataEntity.forEach(entity -> {
			QuestionMetadataDto metaDataDto = new QuestionMetadataDto();
			metaDataDto.setMetadata(entity.getMetadata());
			
			metaDataList.add(metaDataDto);
		});
		
		return metaDataList;
	}

	@Override
	public Optional<QuestionMetadataEntity> findById(Long id) {
		return questionMetadataRepository.findById(id);
	}

	@Override
	public void save(QuestionMetadataDto questionMetadataDto) {
		QuestionMetadataEntity metadataEntity = new QuestionMetadataEntity();
		metadataEntity.setMetadata(questionMetadataDto.getMetadata());
		
		questionMetadataRepository.save(metadataEntity);
	}

	@Override
	public QuestionMetadataEntity save(QuestionMetadataEntity questionMetadataEntity) {
		return questionMetadataRepository.save(questionMetadataEntity);
	}

}