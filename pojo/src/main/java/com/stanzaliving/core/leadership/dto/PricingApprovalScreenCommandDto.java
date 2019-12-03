package com.stanzaliving.core.leadership.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.leadership.enums.LeadershipCommand;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class PricingApprovalScreenCommandDto {

	@NotNull(message = "Leadeship Command can not be null")
	private LeadershipCommand leadershipCommand;
	
	private List<DealTermsDto> dealTermsDtos;
	
	private Double margin;
	
	private String estateUuid;

	private Long estateId;
}
