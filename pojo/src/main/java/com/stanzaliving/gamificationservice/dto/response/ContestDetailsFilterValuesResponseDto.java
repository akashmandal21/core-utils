package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author Keshav Singh
 * @date 12/28/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestDetailsFilterValuesResponseDto {

	@JsonProperty("zone")
	private List<FilterResponseDto> zoneList;
	@JsonProperty("city")
	private List<FilterResponseDto> cityList;
	@JsonProperty("cluster")
	private List<FilterResponseDto> clusterList;

	private String quickFilter;

	private String screen;

}
