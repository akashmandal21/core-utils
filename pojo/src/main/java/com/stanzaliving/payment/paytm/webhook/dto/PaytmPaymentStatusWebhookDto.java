package com.stanzaliving.payment.paytm.webhook.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.payment.paytm.dto.PaytmSourceAccountDetails;
import com.stanzaliving.payment.paytm.dto.PaytmVanInfo;

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
@JsonInclude(Include.NON_NULL)
public class PaytmPaymentStatusWebhookDto {

	@JsonProperty("ORDERID")
	private String orderId;

	@JsonProperty("MID")
	private String mid;

	@JsonProperty("TXNID")
	private String txnId;

	@JsonProperty("TXNAMOUNT")
	private String txnAmount;

	@JsonProperty("CURRENCY")
	private String currency;

	@JsonProperty("PAYMENTMODE")
	private String paytmPaymentMode;

	@JsonProperty("TXNDATE")
	private String txnDate;

	@JsonProperty("STATUS")
	private String status;

	@JsonProperty("RESPCODE")
	private String respCode;

	@JsonProperty("RESPMSG")
	private String respMsg;

	@JsonProperty("GATEWAYNAME")
	private String gatewayName;

	@JsonProperty("BANKTXNID")
	private String bankTxnid;

	@JsonProperty("BANKNAME")
	private String bankName;

	@JsonProperty("CHECKSUMHASH")
	private String checksumHash;

	@JsonProperty("cardScheme")
	private String cardScheme;

	@JsonProperty("CUSTID")
	private String custId;

	@JsonProperty("LASTFOURDIGITS")
	private String lastFourDigits;

	@JsonProperty("transferMode")
	private String transferMode;

	@JsonProperty("bankTransactionDate")
	private String bankTransactionDate;

	@JsonProperty("clientId")
	private String clientId;

	@JsonProperty("BIN")
	private String bin;

	@JsonProperty("vanInfo")
	private PaytmVanInfo vanInfo;

	@JsonProperty("MERC_UNQ_REF")
	private String mercUnqRef;

	@JsonProperty("utr")
	private String utr;

	@JsonProperty("TXNDATETIME")
	private String txnDateTime;

	@JsonProperty("accountDetails")
	private PaytmSourceAccountDetails accountDetails;

}
