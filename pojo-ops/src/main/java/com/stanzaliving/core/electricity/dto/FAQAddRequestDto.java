package com.stanzaliving.core.electricity.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.electricity.constants.FAQType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FAQAddRequestDto {

	@NotBlank(message = "Question cannot be blank")
	private String question;
	
	@NotBlank(message = "Accepted answer cannot be blank")
	private String acceptedAnswer;
	
	@NotNull(message = "FAQTYPE Cannot be null")
	private FAQType faqType;
	
	private String residenceId;

}