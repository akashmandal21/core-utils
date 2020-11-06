package com.stanzaliving.complaint.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class FreshdeskResponseDto {

	private Long id;

	private int source;

	private int priority;

	private int status;
}