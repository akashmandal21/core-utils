/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 22-Nov-2019
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpsReadinessSummaryDto {

	private EntityCountsDto entityCountsDto;

	private List<OpsSummaryListingDto> summaryListingDtos;

}