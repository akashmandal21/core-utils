package com.stanzaliving.payment.paytm.response.dto;

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
public class PaytmRefundResponseDtoBody {

	private PaytmRefundResponseDtoBodyResultInfo resultInfo;
	
	private String mid;

	private String orderId;

	private String refId;

	private String refundAmount;

	private String refundId;

	private String txnId;

	private String txnTimestamp;

}
