/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import lombok.*;

import java.util.List;

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
