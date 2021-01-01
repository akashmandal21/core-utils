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
public class PaytmCustomerDetails {

	@JsonProperty("name")
	private String name;

	@JsonProperty("email")
	private String email;

	@JsonProperty("phone")
	private String phone;

//	The above three variables and below three variables are same but having different names due to use of different naming culture in paytm callback response (PaytmPaymentStatusCallbackDto -> vanInfo -> PaytmCustomerDetails)
	@JsonProperty("customerName")
	private String customerName;

	@JsonProperty("customerEmail")
	private String customerEmail;

	@JsonProperty("customerMobile")
	private String customerMobile;

}
