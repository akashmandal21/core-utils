package com.stanzaliving.payment.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "paymentMode", visible = true)
@JsonSubTypes({
		@JsonSubTypes.Type(value = IciciPaymentRequest.class, name = "ICICI"),
		@JsonSubTypes.Type(value = PaytmPaymentRequest.class, name = "PAYTM")
})
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPaymentDto {

	protected String paymentMode;
	protected String checkSum;
	protected double amount;

	public abstract String getStudentId();

	public abstract String getMerchantTransactionId();

}