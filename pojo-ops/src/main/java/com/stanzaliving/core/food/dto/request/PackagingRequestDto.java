package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class PackagingRequestDto extends AbstractDto {

	private String itemName;

	private String desc;

	private UnitOfMeasurement unitOfMeasurement;

}
