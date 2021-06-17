package com.stanzaliving.wanda.food.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsDataRequestDto extends DemographicsRequestDto {

	private String vendorId;
	private LocalDate date;

}
