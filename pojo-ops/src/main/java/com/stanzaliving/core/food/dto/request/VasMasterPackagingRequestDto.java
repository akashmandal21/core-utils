package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.PackagingMaterial;
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

	@NotNull(message = "Packaging Qty Selection is mandatory")
	private int qty;

	private List<CityPackagingMaterialDto> cityMaterial;
}
