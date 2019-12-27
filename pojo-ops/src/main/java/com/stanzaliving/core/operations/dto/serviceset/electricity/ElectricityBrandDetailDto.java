package com.stanzaliving.core.operations.dto.serviceset.electricity;

import com.stanzaliving.core.operations.enums.ServiceAvailabilityMode;
import com.stanzaliving.core.operations.enums.ServicePaymentMode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ElectricityBrandDetailDto {

	private String componentId;

	private ServiceAvailabilityMode availabilityMode;

	private ServicePaymentMode paymentMode;

}