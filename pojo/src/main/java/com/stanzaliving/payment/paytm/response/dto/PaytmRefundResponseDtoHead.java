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
public class PaytmRefundResponseDtoHead {

	private String clientId;

	private String version;

	private String responseTimestamp;

	private String channelId;

	private String signature;
}
