package com.stanzaliving.core.complaint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CreateComplaintFAQDto {

	private String complaintFAQUuid;

	@NotBlank(message = "Question can't be blank")
	private String question;

	@NotBlank(message = "Answer can't be blank")
	private String answer;

	private Integer sequenceId;

}
