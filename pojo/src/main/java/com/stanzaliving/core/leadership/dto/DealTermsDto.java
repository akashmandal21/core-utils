package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.leadership.enums.DealTermStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class DealTermsDto extends AbstractDto{

	private String name;
	
	private String value;
	
	private DealTermStatus dealTermStatus;
	
	private String dealTermUUid;
	
	private Long estateId;
	
}
