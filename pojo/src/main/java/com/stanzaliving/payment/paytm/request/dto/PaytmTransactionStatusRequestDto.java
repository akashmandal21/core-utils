package com.stanzaliving.payment.paytm.request.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmTransactionStatusRequestDto {

	private PaytmTransactionStatusRequestDtoHead head;

	private PaytmTransactionStatusRequestDtoBody body;

}
