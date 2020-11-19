package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.PackagingMaterial;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 23-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CityPackagingMaterialDto {
	@NotBlank(message = "City Selection is mandatory")
	private String cityId;

	@NotBlank(message = "Package selection for city is mandatory")
	private String packageId;

	@NotNull(message = "Package Qty selection is mandatory")
	private Integer qty;
}
