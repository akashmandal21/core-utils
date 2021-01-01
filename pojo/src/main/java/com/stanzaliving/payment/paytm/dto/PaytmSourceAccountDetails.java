package com.stanzaliving.payment.paytm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmSourceAccountDetails {

	@JsonProperty("maskedAccountNumber")
	private String maskedAccountNumber;

	@JsonProperty("accountHolderName")
	private String accountHolderName;

	@JsonProperty("ifscCode")
	private String ifscCode;

	@JsonProperty("bankName")
	private String bankName;
}
