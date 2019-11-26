/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.operations.enums.OpsReadinessState;

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
public class OpsSummaryListingDto {

	private String statusName;

	private OpsReadinessState opsReadinessState;

	private PageResponse<? extends OperationsScoreDto> scoreDtos;
}