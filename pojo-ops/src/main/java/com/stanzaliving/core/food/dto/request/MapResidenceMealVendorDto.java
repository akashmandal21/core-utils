package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.food.dto.response.DateWiseMealVendorDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-July-2020
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MapResidenceMealVendorDto {

	@NotBlank(message = "Residence id is required")
	private String residenceId;

	@NotEmpty(message = "Date wise vendors are required")
	@Valid
	private List<DateWiseMealVendorDto> dateMealVendors;

}