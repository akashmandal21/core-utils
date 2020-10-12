package com.stanzaliving.core.food.dto.query;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 09-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorItemCountQueryDto {

	private String vendorId;

	private String itemId;

	private Integer count;

}
