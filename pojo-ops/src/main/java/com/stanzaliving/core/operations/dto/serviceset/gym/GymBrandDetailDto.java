package com.stanzaliving.core.operations.dto.serviceset.gym;

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
public class GymBrandDetailDto {

	private String componentId;

	private boolean availableAsVas;

	private LocalTime startTime;

	private LocalTime endTime;

}