package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QualificationQuestionAnswerMetaDataDto {

	private String question;
	private String questionUuid;
	private String questionIdentifier;
	private List<String> options;
	private String frontEndType;

}
