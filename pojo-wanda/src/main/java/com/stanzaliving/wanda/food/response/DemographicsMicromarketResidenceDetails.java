package com.stanzaliving.wanda.food.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsMicromarketResidenceDetails {

	private String microMarketId;
	private String microMarketName;
	private List<DemographicsResidenceDetails> demographicsResidenceDetailsList;

}
