package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.PackagingMaterial;
import com.stanzaliving.core.food.enums.VasItemState;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
	@NotBlank(message = "Package selected is not valid")
	private String packagingId;

	@NotNull(message = "Item State selection is mandatory")
	private VasItemState itemState;

	@NotNull(message = "Packaging material selection is mandatory")
	private PackagingMaterial masterMaterial;

	private List<CityPackagingMaterialDto> cityMaterial;
}
