package com.stanzaliving.core.operations.dto.serviceset.housekeeping;

import java.time.DayOfWeek;
import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.ServiceMetadata;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class HouseKeepingServiceDto extends ServiceMetadata {

	private List<HouseKeepingResidenceDto> houseKeepingResidenceDtos;

	private List<DayOfWeek> dayOfWeeks;
}