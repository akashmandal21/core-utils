/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.designservice.enums.DesignStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyDashboardResponseDto {

	private Long totalRecords;
	private Integer totalPages;
	List<PropertyDto> propertyList;
	Map<DesignStatus, String> designStatusDescription;
	List<DesignStatusCountDto> designStatusCountList;
	Map<DesignStatus, Integer> designStatusCount;
}
