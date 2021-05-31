package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingInventoryDTO {

    private int bookingId;

    private String temporaryStudentId;

    private String studentId;

    private String firstName;

    private String lastName;

    private String email;

    private String studentPhone;

    private String phone;

    private LocalDate contractStartDate;

    private LocalDate contractEndDate;

    private Date actualContractEndDate;

    private String contractLastNMonthStartDate;

    private Date confirmationDate;

    private Date moveInDate;

    private String specialRequestDescription;

    private String upgradeDescription;

    private int contractId;

    private String contractName;

    private double contractMonths;

    private double extendedContractMonths;

    private int paymentTermId;

    private String paymentTermName;

    private int paymentTermInstallments;

    private String chequeNumber;

    private String chequePhoto;

    private String bookingStatus;

    private String roomNumber;

    private String residenceName;
    
    private int emiMonths;

    private double pendingRent;

    private String rentStatus;

    private Date autoCancelTime;

    private double penalty;

    private String lockIn;

    private boolean isRoomConverted;

    private double pendingDues;

    private Date attentionDeadline;

    private Boolean collectPayment;

    private boolean isAlfredEnabled = Boolean.FALSE;
}
