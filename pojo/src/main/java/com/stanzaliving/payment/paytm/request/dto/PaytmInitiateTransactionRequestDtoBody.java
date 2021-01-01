package com.stanzaliving.payment.paytm.request.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.payment.constants.PaytmConstants;
import com.stanzaliving.payment.paytm.dto.PaytmDisablePaymentMode;
import com.stanzaliving.payment.paytm.dto.PaytmEnablePaymentMode;
import com.stanzaliving.payment.paytm.dto.PaytmTxnAmountDto;
import com.stanzaliving.payment.paytm.dto.PaytmUserInfoDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmInitiateTransactionRequestDtoBody {

	@Builder.Default
	private String requestType = PaytmConstants.REQUEST_TYPE;

	private String mid;

	@NotBlank
	private String orderId;

	@Builder.Default
	private String websiteName = PaytmConstants.WEB_WEBSITE;

	private PaytmTxnAmountDto txnAmount;

	private PaytmUserInfoDto userInfo;

	private PaytmEnablePaymentMode[] enablePaymentMode;

	private PaytmDisablePaymentMode[] disablePaymentMode;

	private String callbackUrl;

}
