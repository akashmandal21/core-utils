package com.stanzaliving.core.operations.dto.serviceset.security;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SecurityBrandDetailDto {

	private String componentId;

	private LocalTime startTime;

	private LocalTime endTime;
}