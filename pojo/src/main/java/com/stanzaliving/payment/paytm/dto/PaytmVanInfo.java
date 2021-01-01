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
public class PaytmVanInfo {

	@JsonProperty("van")
	private String van;

	@JsonProperty("beneficiaryName")
	private String beneficiaryName;

	@JsonProperty("ifscCode")
	private String ifscCode;

	@JsonProperty("bankName")
	private String bankName;

	@JsonProperty("purpose")
	private String purpose;

	@JsonProperty("userDefinedFields")
	private PaytmUserDefinedFields userDefinedFields;

	@JsonProperty("customerDetails")
	private PaytmCustomerDetails customerDetails;
}
