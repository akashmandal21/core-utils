package com.stanzaliving.complaint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class CustomFieldsDto {

	@JsonProperty("cf_city_name")
	private String cityName;

	@JsonProperty("cf_micromarket_name")
	private String micromarketName;

	@JsonProperty("cf_house")
	private String residenceName;

	@JsonProperty("cf_room_no")
	private String roomNo;
	
	@JsonProperty("cf_user_phoneno")
	private String userMobileNo;
	
	@JsonProperty("cf_email_id")
	private String userEmail;
	
	@JsonProperty("cf_user_type")
	private String userType;

	@JsonProperty("cf_complain_cat")
	private String complainCat;

	@JsonProperty("cf_complaintype_cat")
	private String complaintypeCat;
	
	@JsonProperty("cf_complaintype_cat10754")
    private String complaintTypeCategory;
	
	@JsonProperty("cf_user_name")
	private String userName;

	@JsonProperty("cf_mode_of_payment")
	private String modeOfPayment;

	@JsonProperty("cf_amount_paid")
	private String amountPaid;

	@JsonProperty("cf_date_of_payment")
	private String dateOfPayment;

	@JsonProperty("cf_reference_number")
	private String referenceNumber;

	@JsonProperty("cf_id_mapped")
	private String idMapped;

	@JsonProperty("cf_actual_contract_start_date")
	private String actualContractStartDate;

	@JsonProperty("cf_change_in_amount_sd")
	private String changeIn;

	@JsonProperty("cf_change_in_installment")
	private String changeInInstallment;

	@JsonProperty("cf_change_value")
	private String value;

	@JsonProperty("cf_agreement_tenure_promised_in_months")
	private String agreementTenurePromisedByStanzaLiving;

	@JsonProperty("cf_discount_amount")
	private String discountAmount;

	@JsonProperty("cf_credit_note_amount")
	private String creditNoteAmount;

	@JsonProperty("cf_issue_date")
	private String issueDate;

	@JsonProperty("cf_requested_rent")
	private String requestedRent;

	@JsonProperty("cf_rent_change_reason")
	private String rentChangeReason;

	@JsonProperty("cf_comments")
	private String comments;

	@JsonProperty("cf_vas_description")
	private String vasDescription;

	@JsonProperty("cf_change_effective_from_date")
	private String changeEffectiveFromDate;

	@JsonProperty("cf_vas_request_type")
	private String requestType;

	@JsonProperty("cf_student_id")
	private String studentId;

	@JsonProperty("cf_complaint_uuid")
	private String complaintId;
	
	@JsonProperty("cf_venta_contract_start_date")
	private String ventaContractStartDate;
	
	@JsonProperty("cf_agreement_tenure_as_per_venta")
	private String agreementTenureAsPerVenta;
	
	@JsonProperty("cf_rent_as_per_venta")
	private String rentAsPerVenta;
	
	@JsonProperty("cf_date_of_request")
	private String dateOfRequest;
	
	@JsonProperty("cf_current_payment_frequency_as_per_venta")
	private String currentPaymentFrequencyAsPerVenta;
	
	@JsonProperty("cf_paid_as_per_venta")
	private String paidAsPerVenta;
	
	@JsonProperty("cf_difference_amount")
	private String differenceAmount;

}