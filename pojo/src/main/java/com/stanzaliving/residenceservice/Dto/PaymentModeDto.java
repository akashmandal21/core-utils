/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.*;

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
