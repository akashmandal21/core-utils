package com.stanzaliving.payment.paytm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaytmUserInfoDto {

	private String custId;

	private String mobile;

	private String email;

	private String firstName;

	private String lastName;

}
