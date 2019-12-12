package com.stanzaliving.core.leadership.dto;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.leadership.enums.LeadershipCommand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@AllArgsConstructor
public class LeadershipCommandDto {

	@NotNull(message = "Leadeship Command can not be null")
	private LeadershipCommand leadershipCommand;
	
	private String estateUuid;

	@NotNull(message = "Estate Id can not be null")
	private Long estateId;
}
