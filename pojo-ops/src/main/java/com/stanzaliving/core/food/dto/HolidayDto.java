package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.HolidayType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayDto extends AbstractDto {

	private String residenceId;

	private LocalDate date;

	private HolidayType holidayType;

	private String description;

}
