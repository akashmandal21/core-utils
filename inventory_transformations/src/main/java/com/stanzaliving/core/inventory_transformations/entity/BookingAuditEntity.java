package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "BOOKING_AUDIT")
@Data
@Entity
public class BookingAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_AUDIT_ID", nullable = false)
	@JsonProperty("booking_audit_id")
    private Integer bookingAuditId;

    @Column(name = "BOOKING_STATUS")
	@JsonProperty("booking_status")
    private String bookingStatus;

    @Column(name = "CHEQUE_NUMBER")
	@JsonProperty("cheque_number")
    private String chequeNumber;

    @Column(name = "CHEQUE_PHOTO")
	@JsonProperty("cheque_photo")
    private String chequePhoto;

    @Column(name = "CONFIRMATION_DATE")
	@JsonProperty("confirmation_date")
    private Timestamp confirmationDate;

    @Column(name = "CONTRACT_END_DATE")
	@JsonProperty("contract_end_date")
    private Timestamp contractEndDate;

    @Column(name = "CONTRACT_ID")
	@JsonProperty("contract_id")
    private Integer contractId;

    @Column(name = "CONTRACT_MONTHS")
	@JsonProperty("contract_months")
    private Double contractMonths;

    @Column(name = "CONTRACT_NAME")
	@JsonProperty("contract_name")
    private String contractName;

    @Column(name = "CONTRACT_START_DATE")
	@JsonProperty("contract_start_date")
    private Timestamp contractStartDate;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "LAST_REMINDED_DATE")
	@JsonProperty("last_reminded_date")
    private Timestamp lastRemindedDate;

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

    @Column(name = "LAST_REMINDED_COUNT")
	@JsonProperty("last_reminded_count")
    private Integer lastRemindedCount;

    @Column(name = "REVISE_AT")
	@JsonProperty("revise_at")
    private Timestamp reviseAt;

    @Column(name = "SPECIAL_REQUEST_DESCRIPTION")
	@JsonProperty("special_request_description")
    private String specialRequestDescription;

    @Column(name = "STARTS_MID_MONTH")
	@JsonProperty("starts_mid_month")
    private Boolean startsMidMonth;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "UPGRADE_DESCRIPTION")
	@JsonProperty("upgrade_description")
    private String upgradeDescription;

    @Column(name = "LEAD_ID")
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "PAYMENT_MODE_ID")
	@JsonProperty("payment_mode_id")
    private Integer paymentModeId;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private String roomId;

    @Column(name = "SPECIAL_REQUEST_ID")
	@JsonProperty("special_request_id")
    private Integer specialRequestId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "UPGRADE_ID")
	@JsonProperty("upgrade_id")
    private Integer upgradeId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("temporary_student_id")
    private Integer temporaryStudentId;

    @Column(name = "BOOKING")
	@JsonProperty("booking")
    private Integer BOOKING;

    @Column(name = "BOOKING_DATA")
	@JsonProperty("booking_data")
    private Boolean bookingData = Boolean.FALSE;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    
}