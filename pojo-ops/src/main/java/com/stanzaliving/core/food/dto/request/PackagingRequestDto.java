package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 12-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PackagingRequestDto {

	private String itemName;

	private String desc;

	private UnitOfMeasurement unitOfMeasurement;

	private boolean status;

}
