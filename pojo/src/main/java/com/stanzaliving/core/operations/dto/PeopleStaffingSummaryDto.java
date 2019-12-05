/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 03-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeopleStaffingSummaryDto {

	private Map<AccessLevel, List<StaffingRequirementSummaryDto>> staffingMap;

}