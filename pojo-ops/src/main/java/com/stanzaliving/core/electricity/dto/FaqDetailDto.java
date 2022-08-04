package com.stanzaliving.core.electricity.dto;


import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.FaqType;

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
public class FaqDetailDto extends AbstractDto {

	private static final long serialVersionUID = 1540383676240233943L;

	private String question;
	
	private String acceptedAnswer;

	private FaqType faqType;
	
	private String faqTypeName; 
	
	private String residenceId;
	
	private Integer sequence;

}