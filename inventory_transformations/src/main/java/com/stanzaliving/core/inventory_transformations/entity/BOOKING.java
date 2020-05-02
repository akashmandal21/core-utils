package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BOOKING")
@Data
public class BOOKING implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
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

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

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

    @Column(name = "BOOKING_TYPE", nullable = false)
    private Integer bookingType = 0;

    @Column(name = "ACTUAL_CONTRACT_END_DATE")
    private LocalDateTime actualContractEndDate;

    @Column(name = "BOOKING_SUBSTATUS")
    private Integer bookingSubstatus = 0;

    @Column(name = "HAS_MOVED_IN")
    private Integer hasMovedIn = 0;

    @Column(name = "LOCK_IN")
    private String lockIn;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "IN_PROGRESS")
    private Integer inProgress = 0;

    @Column(name = "LOCK_IN_MONTHS")
    private Double lockInMonths;

    
}