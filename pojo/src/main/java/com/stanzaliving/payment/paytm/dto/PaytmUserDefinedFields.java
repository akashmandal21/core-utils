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
public class PaytmUserDefinedFields {

	@JsonProperty("udf1")
	private String udf1;

	@JsonProperty("udf2")
	private String udf2;

	@JsonProperty("udf3")
	private String udf3;

	@JsonProperty("udf4")
	private String udf4;

	@JsonProperty("udf5")
	private String udf5;
}
