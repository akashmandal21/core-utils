/**
 * 
 */
package com.stanzaliving.core.cafe.dto;
import java.util.List;

import com.stanzaliving.core.cafe.enums.Tags;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author Ashutosh.Chandra
 *
 * @date 22-Oct-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeListingDto {

	private String uuid;

	private String cafeName;

	private List<Tags> tags;
	
	private String cityId;

	private String cityName;

	private List<BaseKitchenDto> baseKitchens;
	
	private long mappedResidenceCount;
	

}