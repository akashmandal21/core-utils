package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.PackagingMaterial;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 15-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterPackagingResponseDto {
	private String packagingId;

	private String packagingName;

	private Integer qty;

	private List<CityPackagingMaterialResponseDto> cityMaterial;
}
