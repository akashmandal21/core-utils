package com.stanzaliving.core.leadership.dto;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.leadership.enums.LeadershipCommand;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class LeadershipCommandDto {

	@NotNull(message = "Leadeship Command can not be null")
	private LeadershipCommand leadershipCommand;
	
	private String estateUuid;

	@NotNull(message = "Estate Id can not be null")
	private Long estateId;
	
	private PropertyNamingDto propertyNamingDto;
}
