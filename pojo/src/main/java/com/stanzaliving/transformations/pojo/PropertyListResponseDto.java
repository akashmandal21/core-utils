/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyListResponseDto {

	private long totalRecords;
	private List<PropertyDetailInfoResponseDto> propertyDetailInfoList;
}
