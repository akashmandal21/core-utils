/**
 * 
 */
package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.enums.CafeType;

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

	private CafeType cafeType;

	private String cafeTypeName;

	private String cityId;

	private String cityName;

	private String baseKitchenId;

	private String baseKitchenName;
}