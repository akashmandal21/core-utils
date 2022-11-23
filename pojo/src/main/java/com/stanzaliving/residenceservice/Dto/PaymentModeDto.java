/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import com.stanzaliving.core.payment.enums.PaymentMode;

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
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModeDto {

	private PaymentMode paymentMode;
	private String paymentModeDesc;
}
