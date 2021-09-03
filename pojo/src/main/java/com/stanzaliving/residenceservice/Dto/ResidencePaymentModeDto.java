/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidencePaymentModeDto {

	private String residenceUuid;
	private List<PaymentModeDto> paymentDtoList;
}
