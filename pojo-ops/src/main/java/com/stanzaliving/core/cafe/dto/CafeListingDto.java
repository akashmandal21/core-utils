/**
 * 
 */
package com.stanzaliving.core.cafe.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.cafe.enums.Tags;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 13-Oct-2020
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

	private List<Tags> cafeType;

	private String cafeTypeName;

	private String cityId;

	private String cityName;

	private List<ListingDto> baseKitchens;

	private String baseKitchenName;
}