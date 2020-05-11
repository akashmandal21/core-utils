package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "BOOKING")
public class BookingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
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

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

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

    @Column(name = "BOOKING_TYPE", nullable = false)
	@JsonProperty("BOOKING_TYPE")
    private Integer bookingType = 0;

    @Column(name = "ACTUAL_CONTRACT_END_DATE")
	@JsonProperty("ACTUAL_CONTRACT_END_DATE")
    private Timestamp actualContractEndDate;

    @Column(name = "BOOKING_SUBSTATUS")
	@JsonProperty("BOOKING_SUBSTATUS")
    private Integer bookingSubstatus = 0;

    @Column(name = "HAS_MOVED_IN")
	@JsonProperty("HAS_MOVED_IN")
    private Boolean hasMovedIn = false;

    @Column(name = "LOCK_IN")
	@JsonProperty("LOCK_IN")
    private String lockIn;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "IN_PROGRESS")
	@JsonProperty("IN_PROGRESS")
    private Boolean inProgress = false;

    @Column(name = "LOCK_IN_MONTHS")
	@JsonProperty("LOCK_IN_MONTHS")
    private Double lockInMonths;

    
}