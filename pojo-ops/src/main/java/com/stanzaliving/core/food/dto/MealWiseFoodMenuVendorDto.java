/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 23-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealWiseFoodMenuVendorDto {

	@NotNull(message = "Meal type is mandatory in vendor")
	private MealType mealType;

	private String mealTypeName;

	@NotBlank(message = "Vendor Id is mandatory for meal")
	private String vendorId;

	private String vendorName;

	private List<ListingDto> availableVendors;
}