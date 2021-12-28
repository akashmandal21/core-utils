package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

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
public class ClusterNameDetailsDto {
	private String clusterName;

	private String clusterUuid;

	private String zone;

	private String cityUuid;

	private String cityName;
}
