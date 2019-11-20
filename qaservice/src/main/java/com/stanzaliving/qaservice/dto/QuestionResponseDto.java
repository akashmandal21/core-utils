package com.stanzaliving.qaservice.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.qaservice.entity.QuestionEntity;
import com.stanzaliving.qaservice.enums.FrontEndType;
import com.stanzaliving.qaservice.enums.QuestionType;
import com.stanzaliving.qaservice.enums.SubQuestionDisplay;

@Getter
@ToString
public class QuestionResponseDto {

	private String id;

	@Enumerated(EnumType.STRING)
	private QuestionType questionType;

	private String frontendType;

	private String questionHeading;

	private String quesSubHeading;

	private Integer isMandatory;

	private String visibilityCriteria;

	private Integer screenGroupNum;

	private Integer screenNum;

	private Integer orderNum;

	@Enumerated(EnumType.STRING)
	private SubQuestionDisplay subQuestionDisplay;

	private Object metadata;

	public QuestionResponseDto(QuestionEntity question, Object metadata) {
		this.id = StringUtils.isEmpty(question.getQuestionIdentifier()) ? question.getUuid() : question.getQuestionIdentifier();
		this.questionType = question.getQuestionType();
		this.frontendType = question.getFrontendType();
		this.questionHeading = question.getQuesHeading();
		this.quesSubHeading = question.getQuesSubHeading();
		this.isMandatory = question.getIsMandatory();
		this.visibilityCriteria = question.getVisibilityCriteria();
		this.screenGroupNum = question.getScreenGroupNum();
		this.screenNum = question.getScreenNum();
		this.orderNum = question.getOrderNum();
		this.subQuestionDisplay = question.getSubQuestionDisplay();
		this.metadata = metadata;
	}

}