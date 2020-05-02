package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BOOKING_TIMELINE_HISTORY")
@Data
public class BookingTimelineHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED_TIMESTAMP")
    private LocalDateTime createdTimestamp;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "BOOKING_AMOUNT")
    private Double bookingAmount;

    @Column(name = "BOOKING_STATUS")
    private String bookingStatus;

    @Column(name = "CHEQUE_NUMBER")
    private String chequeNumber;

    @Column(name = "CHEQUE_PHOTO")
    private String chequePhoto;

    @Column(name = "CONTRACT_ID")
    private Integer contractId;

    @Column(name = "contract_months", nullable = false)
    private Double contractMonths;

    @Column(name = "CONTRACT_NAME")
    private String contractName;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MOVE_IN_DATE")
    private LocalDateTime moveInDate;

    @Column(name = "PAYMENT_TERM_ID")
    private Integer paymentTermId;

    @Column(name = "PAYMENT_TERM_INSTALLMENTS")
    private Integer paymentTermInstallments;

    @Column(name = "PAYMENT_TERM_NAME")
    private String paymentTermName;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "SPECIAL_REQUEST_DESCRIPTION")
    private String specialRequestDescription;

    @Column(name = "UPGRADE_DESCRIPTION")
    private String upgradeDescription;

    @Column(name = "LEAD_ID")
    private Integer leadId;

    @Column(name = "PAYMENT_MODE_ID")
    private Integer paymentModeId;

    @Column(name = "SPECIAL_REQUEST_ID")
    private Integer specialRequestId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "UPGRADE_ID")
    private Integer upgradeId;

    @Column(name = "CONTRACT_START_DATE")
    private LocalDateTime contractStartDate;

    @Column(name = "REVISE_AT")
    private LocalDateTime reviseAt;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "CONTRACT_END_DATE")
    private LocalDateTime contractEndDate;

    @Column(name = "STARTS_MID_MONTH")
    private Boolean startsMidMonth;

    @Column(name = "CONFIRMATION_DATE")
    private LocalDateTime confirmationDate;

    @Column(name = "LAST_REMINDED_DATE")
    private LocalDateTime lastRemindedDate;

    @Column(name = "LAST_REMINDED_COUNT")
    private Integer lastRemindedCount = 0;

    @Column(name = "AUTO_CANCEL_TIME")
    private LocalDateTime autoCancelTime;

    
}