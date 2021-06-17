package com.stanzaliving.wanda.food.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DemographicsDataRequestDto extends DemographicsRequestDto {

	private String vendorId;

	@JsonSerialize(using = Java8LocalDateStdSerializer.class)
	private LocalDate date;

}
