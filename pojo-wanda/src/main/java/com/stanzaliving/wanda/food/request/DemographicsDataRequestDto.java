package com.stanzaliving.wanda.food.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DemographicsDataRequestDto extends DemographicsRequestDto {

	private String vendorId;

}
