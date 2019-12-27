package com.stanzaliving.core.operations.dto.serviceset.electricity;

import com.stanzaliving.core.operations.dto.serviceset.BrandComponentDto;
import com.stanzaliving.core.operations.enums.ServiceAvailabilityMode;
import com.stanzaliving.core.operations.enums.ServicePaymentMode;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ElectricityBrandDetailDto extends BrandComponentDto {

	private ServiceAvailabilityMode availabilityMode;

	private ServicePaymentMode paymentMode;

}