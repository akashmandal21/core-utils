package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 12-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorResponseDto {

	private String vendorId;
	
	private String vendorName;

	private String cityId;

	private String cityName;

	private String phone;

	private String email;

	private int hostelsMapped;

	private boolean pricing;

	private boolean stanzaKitchen;
}