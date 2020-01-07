package com.stanzaliving.core.operations.dto.serviceset.food;

import java.time.LocalTime;

import com.stanzaliving.core.operations.dto.serviceset.ComponentMetadataDto;

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
public class FoodMealDto extends ComponentMetadataDto {

	private LocalTime startTime;

	private LocalTime endTime;

}