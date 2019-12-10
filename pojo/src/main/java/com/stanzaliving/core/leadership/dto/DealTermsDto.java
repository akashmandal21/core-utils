package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.leadership.enums.DealTermStatus;
import com.stanzaliving.core.leadership.enums.DealTermsEnum;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode(of="identifier",callSuper = false)
public class DealTermsDto extends AbstractDto{

	private DealTermsEnum identifier;
	
	private String name;
	
	private String value;
	
	private DealTermStatus dealTermStatus;
	
	private Long estateId;
	
}
