/**
 * 
 */
package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.payment.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 15 Sep, 2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto extends AbstractDto {

	private static final long serialVersionUID = -5460205171309799210L;

	private String merchantTransactionId;

	private double amount;

	private PaymentStatus paymentStatus;

	private String userId;

	private String paymentMetadata;
}