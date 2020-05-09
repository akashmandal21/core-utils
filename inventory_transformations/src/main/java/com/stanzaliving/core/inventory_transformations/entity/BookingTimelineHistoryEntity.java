package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
//@Entity
@Table(name = "BOOKING_TIMELINE_HISTORY")
public class BookingTimelineHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED_TIMESTAMP")
	@JsonProperty("CREATED_TIMESTAMP")
    private Timestamp createdTimestamp;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "BOOKING_AMOUNT")
	@JsonProperty("BOOKING_AMOUNT")
    private Double bookingAmount;

    @Column(name = "BOOKING_STATUS")
	@JsonProperty("BOOKING_STATUS")
    private String bookingStatus;

    @Column(name = "CHEQUE_NUMBER")
	@JsonProperty("CHEQUE_NUMBER")
    private String chequeNumber;

    @Column(name = "CHEQUE_PHOTO")
	@JsonProperty("CHEQUE_PHOTO")
    private String chequePhoto;

    @Column(name = "CONTRACT_ID")
	@JsonProperty("CONTRACT_ID")
    private Integer contractId;

    @Column(name = "contract_months", nullable = false)
	@JsonProperty("contract_months")
    private Double contractMonths;

    @Column(name = "CONTRACT_NAME")
	@JsonProperty("CONTRACT_NAME")
    private String contractName;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "MOVE_IN_DATE")
	@JsonProperty("MOVE_IN_DATE")
    private Timestamp moveInDate;

    @Column(name = "PAYMENT_TERM_ID")
	@JsonProperty("PAYMENT_TERM_ID")
    private Integer paymentTermId;

    @Column(name = "PAYMENT_TERM_INSTALLMENTS")
	@JsonProperty("PAYMENT_TERM_INSTALLMENTS")
    private Integer paymentTermInstallments;

    @Column(name = "PAYMENT_TERM_NAME")
	@JsonProperty("PAYMENT_TERM_NAME")
    private String paymentTermName;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "SPECIAL_REQUEST_DESCRIPTION")
	@JsonProperty("SPECIAL_REQUEST_DESCRIPTION")
    private String specialRequestDescription;

    @Column(name = "UPGRADE_DESCRIPTION")
	@JsonProperty("UPGRADE_DESCRIPTION")
    private String upgradeDescription;

    @Column(name = "LEAD_ID")
	@JsonProperty("LEAD_ID")
    private Integer leadId;

    @Column(name = "PAYMENT_MODE_ID")
	@JsonProperty("PAYMENT_MODE_ID")
    private Integer paymentModeId;

    @Column(name = "SPECIAL_REQUEST_ID")
	@JsonProperty("SPECIAL_REQUEST_ID")
    private Integer specialRequestId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "UPGRADE_ID")
	@JsonProperty("UPGRADE_ID")
    private Integer upgradeId;

    @Column(name = "CONTRACT_START_DATE")
	@JsonProperty("CONTRACT_START_DATE")
    private Timestamp contractStartDate;

    @Column(name = "REVISE_AT")
	@JsonProperty("REVISE_AT")
    private Timestamp reviseAt;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "CONTRACT_END_DATE")
	@JsonProperty("CONTRACT_END_DATE")
    private Timestamp contractEndDate;

    @Column(name = "STARTS_MID_MONTH")
	@JsonProperty("STARTS_MID_MONTH")
    private Boolean startsMidMonth;

    @Column(name = "CONFIRMATION_DATE")
	@JsonProperty("CONFIRMATION_DATE")
    private Timestamp confirmationDate;

    @Column(name = "LAST_REMINDED_DATE")
	@JsonProperty("LAST_REMINDED_DATE")
    private Timestamp lastRemindedDate;

    @Column(name = "LAST_REMINDED_COUNT")
	@JsonProperty("LAST_REMINDED_COUNT")
    private Integer lastRemindedCount = 0;

    @Column(name = "AUTO_CANCEL_TIME")
	@JsonProperty("AUTO_CANCEL_TIME")
    private Timestamp autoCancelTime;

    
}