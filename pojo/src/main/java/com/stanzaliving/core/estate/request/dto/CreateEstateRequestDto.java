/**
 * 
 */
package com.stanzaliving.core.estate.request.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.user.dto.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateEstateRequestDto {

	@NotNull(message = "City is Mandatory for Estate")
	@Min(value = 1, message = "City Id cannot be less than 1")
	private Long cityId;

	@NotNull(message = "Micro Markert is Mandatory for Estate")
	@Min(value = 1, message = "Micro Market Id cannot be less than 1")
	private Long micromarketId;

	@NotBlank(message = "Estate Name is Mandatory")
	private String estateName;

	@NotNull(message = "Estate Address is Mandatory")
	private Address address;
}