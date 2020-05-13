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
	@JsonProperty("s_no")
    private Integer sNo;

    @Column(name = "ReservationNo", nullable = false)
	@JsonProperty("reservationno")
    private String ReservationNo;

    @Column(name = "GuestFullName", nullable = false)
	@JsonProperty("guestfullname")
    private String GuestFullName;

    @Column(name = "Email")
	@JsonProperty("email")
    private String Email;

    @Column(name = "Phone")
	@JsonProperty("phone")
    private String Phone;

    @Column(name = "CompanyName")
	@JsonProperty("companyname")
    private String CompanyName;

    @Column(name = "RateCardName")
	@JsonProperty("ratecardname")
    private String RateCardName;

    @Column(name = "Code")
	@JsonProperty("code")
    private String Code;

    @Column(name = "RoomTypeName")
	@JsonProperty("roomtypename")
    private String RoomTypeName;

    @Column(name = "CheckInDate")
	@JsonProperty("checkindate")
    @Temporal(TemporalType.DATE)
    private Date CheckInDate;

    @Column(name = "CheckOutDate")
	@JsonProperty("checkoutdate")
    @Temporal(TemporalType.DATE)
    private Date CheckOutDate;

    @Column(name = "RoomNo")
	@JsonProperty("roomno")
    private String RoomNo;

    @Column(name = "Security_Deposit")
	@JsonProperty("security_deposit")
    private Integer securityDeposit;

    @Column(name = "Excess_Rental")
	@JsonProperty("excess_rental")
    private Integer excessRental;

    @Column(name = "Total_Amount")
	@JsonProperty("total_amount")
    private Integer totalAmount;

    @Column(name = "Confirmation_Code")
	@JsonProperty("confirmation_code")
    private String confirmationCode;

    @Column(name = "Accepted", nullable = false)
	@JsonProperty("accepted")
    private Boolean Accepted = false;

    @Column(name = "Approved_Timestamp")
	@JsonProperty("approved_timestamp")
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