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
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "BOOKING_AMOUNT")
	@JsonProperty("booking_amount")
    private Double bookingAmount;

    @Column(name = "BOOKING_STATUS")
	@JsonProperty("booking_status")
    private String bookingStatus;

    @Column(name = "CHEQUE_NUMBER")
	@JsonProperty("cheque_number")
    private String chequeNumber;

    @Column(name = "CHEQUE_PHOTO")
	@JsonProperty("cheque_photo")
    private String chequePhoto;

    @Column(name = "CONTRACT_ID")
	@JsonProperty("contract_id")
    private Integer contractId;

    @Column(name = "contract_months", nullable = false)
	@JsonProperty("contract_months")
    private Double contractMonths;

    @Column(name = "CONTRACT_NAME")
	@JsonProperty("contract_name")
    private String contractName;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "MOVE_IN_DATE")
	@JsonProperty("move_in_date")
    private Timestamp moveInDate;

    @Column(name = "PAYMENT_TERM_ID")
	@JsonProperty("payment_term_id")
    private Integer paymentTermId;

    @Column(name = "PAYMENT_TERM_INSTALLMENTS")
	@JsonProperty("payment_term_installments")
    private Integer paymentTermInstallments;

    @Column(name = "PAYMENT_TERM_NAME")
	@JsonProperty("payment_term_name")
    private String paymentTermName;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "SPECIAL_REQUEST_DESCRIPTION")
	@JsonProperty("special_request_description")
    private String specialRequestDescription;

    @Column(name = "UPGRADE_DESCRIPTION")
	@JsonProperty("upgrade_description")
    private String upgradeDescription;

    @Column(name = "LEAD_ID")
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "PAYMENT_MODE_ID")
	@JsonProperty("payment_mode_id")
    private Integer paymentModeId;

    @Column(name = "SPECIAL_REQUEST_ID")
	@JsonProperty("special_request_id")
    private Integer specialRequestId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("temporary_student_id")
    private Integer temporaryStudentId;

    @Column(name = "UPGRADE_ID")
	@JsonProperty("upgrade_id")
    private Integer upgradeId;

    @Column(name = "CONTRACT_START_DATE")
	@JsonProperty("contract_start_date")
    private Timestamp contractStartDate;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "REVISE_AT")
	@JsonProperty("revise_at")
    private Timestamp reviseAt;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "CONTRACT_END_DATE")
	@JsonProperty("contract_end_date")
    private Timestamp contractEndDate;

    @Column(name = "STARTS_MID_MONTH")
	@JsonProperty("starts_mid_month")
    private Boolean startsMidMonth;

    @Column(name = "CONFIRMATION_DATE")
	@JsonProperty("confirmation_date")
    private Timestamp confirmationDate;

    @Column(name = "LAST_REMINDED_DATE")
	@JsonProperty("last_reminded_date")
    private Timestamp lastRemindedDate;

    @Column(name = "LAST_REMINDED_COUNT")
	@JsonProperty("last_reminded_count")
    private Integer lastRemindedCount = 0;

    @Column(name = "AUTO_CANCEL_TIME")
	@JsonProperty("auto_cancel_time")
    private Timestamp autoCancelTime;

    @Column(name = "BOOKING_TYPE", nullable = false)
	@JsonProperty("booking_type")
    private Integer bookingType = 0;

    @Column(name = "ACTUAL_CONTRACT_END_DATE")
	@JsonProperty("actual_contract_end_date")
    private Timestamp actualContractEndDate;

    @Column(name = "BOOKING_SUBSTATUS")
	@JsonProperty("booking_substatus")
    private Integer bookingSubstatus = 0;

    @Column(name = "HAS_MOVED_IN")
	@JsonProperty("has_moved_in")
    private Boolean hasMovedIn = false;

    @Column(name = "LOCK_IN")
	@JsonProperty("lock_in")
    private String lockIn;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "IN_PROGRESS")
	@JsonProperty("in_progress")
    private Boolean inProgress = false;

    @Column(name = "LOCK_IN_MONTHS")
	@JsonProperty("lock_in_months")
    private Double lockInMonths;

    
}