package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "uniworld_guest")
public class UniworldGuest implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "S_No", insertable = false, nullable = false)
    private Integer sNo;

    @Column(name = "ReservationNo", nullable = false)
    private String ReservationNo;

    @Column(name = "GuestFullName", nullable = false)
    private String GuestFullName;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "CompanyName")
    private String CompanyName;

    @Column(name = "RateCardName")
    private String RateCardName;

    @Column(name = "Code")
    private String Code;

    @Column(name = "RoomTypeName")
    private String RoomTypeName;

    @Column(name = "CheckInDate")
    private LocalDate CheckInDate;

    @Column(name = "CheckOutDate")
    private LocalDate CheckOutDate;

    @Column(name = "RoomNo")
    private String RoomNo;

    @Column(name = "Security_Deposit")
    private Integer securityDeposit;

    @Column(name = "Excess_Rental")
    private Integer excessRental;

    @Column(name = "Total_Amount")
    private Integer totalAmount;

    @Column(name = "Confirmation_Code")
    private String confirmationCode;

    @Column(name = "Accepted", nullable = false)
    private Integer Accepted = 0;

    @Column(name = "Approved_Timestamp")
    private LocalDateTime approvedTimestamp;

    @Column(name = "plan")
    private String plan;

    @Column(name = "agreement_link")
    private String agreementLink;

    @Column(name = "document_id")
    private String documentId;

    
}