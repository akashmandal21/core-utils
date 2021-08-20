package com.stanzaliving.wanda.food.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsResidenceDetails {

	private String residenceId;
	private String residenceName;

}
