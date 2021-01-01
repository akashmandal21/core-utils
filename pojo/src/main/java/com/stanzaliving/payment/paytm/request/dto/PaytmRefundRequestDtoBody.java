package com.stanzaliving.payment.paytm.request.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.payment.paytm.dto.AgentInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmRefundRequestDtoBody {

	private String mid;

	private String orderId;

	private String refId;

	private String txnId;

	private Double refundAmount;

	private String txnType;

	private String comments;

	private String preferredDestination;

	private String disableMerchantDebitRetry;

	private AgentInfo agentInfo;
}
