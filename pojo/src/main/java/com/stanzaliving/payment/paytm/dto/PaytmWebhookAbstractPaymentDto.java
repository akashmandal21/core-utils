package com.stanzaliving.payment.paytm.dto;

import com.stanzaliving.payment.dto.AbstractPaymentDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PaytmWebhookAbstractPaymentDto extends AbstractPaymentDto{

	private String orderId;

	private String mid;

	private String txnId;

	private String txnAmount;

	private String currency;

	private String paytmPaymentMode;

	private String txnDate;

	private String status;

	private String respCode;

	private String respMsg;

	private String gatewayName;

	private String bankTxnid;

	private String bankName;

	private String checksumHash;

	private String cardScheme;

	private String custId;

	private String lastFourDigits;

	private String transferMode;

	private String bankTransactionDate;

	private String clientId;

	private String bin;

	private PaytmVanInfo vanInfo;

	private String mercUnqRef;

	private String utr;

	private String txnDateTime;

	private PaytmSourceAccountDetails accountDetails;

	@Override
	public String getStudentId() {
		return custId;
	}

	@Override
	public String getMerchantTransactionId() {
		return txnId;
	}

}
