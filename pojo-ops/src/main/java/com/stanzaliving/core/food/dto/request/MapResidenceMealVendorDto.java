package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.dto.response.DateWiseMealVendorDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

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
	private List<DateWiseMealVendorDto> dateMealVendors;

}
