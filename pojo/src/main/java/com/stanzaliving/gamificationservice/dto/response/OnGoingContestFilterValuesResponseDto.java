package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class OnGoingContestFilterValuesResponseDto {

	private List<FilterResponseDto> zone;

	private List<FilterResponseDto> city;

	private List<FilterResponseDto> cluster;

	private String quickFilter;

	private String screen;

}
