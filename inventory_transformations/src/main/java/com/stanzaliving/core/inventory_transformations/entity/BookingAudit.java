package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "BOOKING_AUDIT")
@Entity
@Data
public class BookingAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_AUDIT_ID", nullable = false)
    private Integer bookingAuditId;

    @Column(name = "BOOKING_STATUS")
    private String bookingStatus;

    @Column(name = "CHEQUE_NUMBER")
    private String chequeNumber;

    @Column(name = "CHEQUE_PHOTO")
    private String chequePhoto;

    @Column(name = "CONFIRMATION_DATE")
    private LocalDateTime confirmationDate;

    @Column(name = "CONTRACT_END_DATE")
    private LocalDateTime contractEndDate;

    @Column(name = "CONTRACT_ID")
    private Integer contractId;

    @Column(name = "CONTRACT_MONTHS")
    private Double contractMonths;

    @Column(name = "CONTRACT_NAME")
    private String contractName;

    @Column(name = "CONTRACT_START_DATE")
    private LocalDateTime contractStartDate;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "LAST_REMINDED_DATE")
    private LocalDateTime lastRemindedDate;

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

    @Column(name = "LAST_REMINDED_COUNT")
    private Integer lastRemindedCount;

    @Column(name = "REVISE_AT")
    private LocalDateTime reviseAt;

    @Column(name = "SPECIAL_REQUEST_DESCRIPTION")
    private String specialRequestDescription;

    @Column(name = "STARTS_MID_MONTH")
    private Boolean startsMidMonth;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "UPGRADE_DESCRIPTION")
    private String upgradeDescription;

    @Column(name = "LEAD_ID")
    private Integer leadId;

    @Column(name = "PAYMENT_MODE_ID")
    private Integer paymentModeId;

    @Column(name = "ROOM_ID")
    private String roomId;

    @Column(name = "SPECIAL_REQUEST_ID")
    private Integer specialRequestId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "UPGRADE_ID")
    private Integer upgradeId;

    @Column(name = "TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "BOOKING")
    private Integer BOOKING;

    @Column(name = "BOOKING_DATA")
    private Boolean bookingData = Boolean.FALSE;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "TYPE")
    private String TYPE;

    
}