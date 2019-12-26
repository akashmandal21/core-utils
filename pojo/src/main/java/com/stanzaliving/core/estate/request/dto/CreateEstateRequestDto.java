/**
 * 
 */
package com.stanzaliving.core.estate.request.dto;

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

	private Long cityId;

	private Long micromarketId;

	@NotBlank(message = "Estate Name is Mandatory")
	private String estateName;

	private Address address;

	@NotNull(message = "Estate Lattitude is Mandatory")
	private Double lat;

	@NotNull(message = "Estate Longitude is Mandatory")
	private Double lon;
}