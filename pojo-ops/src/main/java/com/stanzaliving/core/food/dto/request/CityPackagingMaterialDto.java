package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.PackagingMaterial;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
	private String cityId;

	private PackagingMaterial material;
}
