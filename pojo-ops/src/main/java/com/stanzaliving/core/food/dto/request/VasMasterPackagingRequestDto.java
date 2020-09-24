package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.PackagingMaterial;
import com.stanzaliving.core.food.enums.VasItemState;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class VasMasterPackagingRequestDto {
	private String packagingId;

	private VasItemState itemState;

	private PackagingMaterial masterMaterial;

	private List<CityPackagingMaterialDto> cityMaterial;
}
