package com.stanzaliving.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class IciciPaymentRequest extends AbstractPaymentDto {

	@JsonProperty("Client_Code")
	private String clientCode;

	@JsonProperty("Client_Validate_No1")
	private String studentId;

	@JsonProperty("I-Sure_ID")
	private String merchantTransactionId;

	private String date;

	@JsonProperty("pay_mode")
	private String payMode;

	@JsonProperty("MICR_CODE")
	private String micrCode;

	@JsonProperty("IBANK_Transaction_Id")
	private String iBankTransactionId;

	@JsonProperty("Bank_Name")
	private String bankName;

	@JsonProperty("Branch_Name")
	private String branchName;

	@JsonProperty("Instrument_Number")
	private String instrumentNumber;

	@JsonProperty("Instrument_Date")
	private String instrumentDate;

}