package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//@Entity
@Table(name = "uniworld_guest")
@Data
public class UniworldGuestEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "S_No", insertable = false, nullable = false)
	@JsonProperty("S_No")
    private Integer sNo;

    @Column(name = "ReservationNo", nullable = false)
	@JsonProperty("ReservationNo")
    private String ReservationNo;

    @Column(name = "GuestFullName", nullable = false)
	@JsonProperty("GuestFullName")
    private String GuestFullName;

    @Column(name = "Email")
	@JsonProperty("Email")
    private String Email;

    @Column(name = "Phone")
	@JsonProperty("Phone")
    private String Phone;

    @Column(name = "CompanyName")
	@JsonProperty("CompanyName")
    private String CompanyName;

    @Column(name = "RateCardName")
	@JsonProperty("RateCardName")
    private String RateCardName;

    @Column(name = "Code")
	@JsonProperty("Code")
    private String Code;

    @Column(name = "RoomTypeName")
	@JsonProperty("RoomTypeName")
    private String RoomTypeName;

    @Column(name = "CheckInDate")
	@JsonProperty("CheckInDate")
    @Temporal(TemporalType.DATE)
    private Date CheckInDate;

    @Column(name = "CheckOutDate")
	@JsonProperty("CheckOutDate")
    @Temporal(TemporalType.DATE)
    private Date CheckOutDate;

    @Column(name = "RoomNo")
	@JsonProperty("RoomNo")
    private String RoomNo;

    @Column(name = "Security_Deposit")
	@JsonProperty("Security_Deposit")
    private Integer securityDeposit;

    @Column(name = "Excess_Rental")
	@JsonProperty("Excess_Rental")
    private Integer excessRental;

    @Column(name = "Total_Amount")
	@JsonProperty("Total_Amount")
    private Integer totalAmount;

    @Column(name = "Confirmation_Code")
	@JsonProperty("Confirmation_Code")
    private String confirmationCode;

    @Column(name = "Accepted", nullable = false)
	@JsonProperty("Accepted")
    private Boolean Accepted = false;

    @Column(name = "Approved_Timestamp")
	@JsonProperty("Approved_Timestamp")
    private Timestamp approvedTimestamp;

    @Column(name = "plan")
	@JsonProperty("plan")
    private String plan;

    @Column(name = "agreement_link")
	@JsonProperty("agreement_link")
    private String agreementLink;

    @Column(name = "document_id")
	@JsonProperty("document_id")
    private String documentId;

    
}