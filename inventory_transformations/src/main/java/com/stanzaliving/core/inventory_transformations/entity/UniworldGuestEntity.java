//package com.stanzaliving.core.inventory_transformations.entity;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.sql.Timestamp;
//import java.util.Date;
//
////@Entity
//@Table(name = "uniworld_guest")
//@Data
//public class UniworldGuestEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "S_No", insertable = false, nullable = false)
//	@JsonProperty("S_NO")
//    private Integer sNo;
//
//    @Column(name = "ReservationNo", nullable = false)
//	@JsonProperty("RESERVATIONNO")
//    private String ReservationNo;
//
//    @Column(name = "GuestFullName", nullable = false)
//	@JsonProperty("GUESTFULLNAME")
//    private String GuestFullName;
//
//    @Column(name = "Email")
//	@JsonProperty("EMAIL")
//    private String Email;
//
//    @Column(name = "Phone")
//	@JsonProperty("PHONE")
//    private String Phone;
//
//    @Column(name = "CompanyName")
//	@JsonProperty("COMPANYNAME")
//    private String CompanyName;
//
//    @Column(name = "RateCardName")
//	@JsonProperty("RATECARDNAME")
//    private String RateCardName;
//
//    @Column(name = "Code")
//	@JsonProperty("CODE")
//    private String Code;
//
//    @Column(name = "RoomTypeName")
//	@JsonProperty("ROOMTYPENAME")
//    private String RoomTypeName;
//
//    @Column(name = "CheckInDate")
//	@JsonProperty("CHECKINDATE")
//    @Temporal(TemporalType.DATE)
//    private Date CheckInDate;
//
//    @Column(name = "CheckOutDate")
//	@JsonProperty("CHECKOUTDATE")
//    @Temporal(TemporalType.DATE)
//    private Date CheckOutDate;
//
//    @Column(name = "RoomNo")
//	@JsonProperty("ROOMNO")
//    private String RoomNo;
//
//    @Column(name = "Security_Deposit")
//	@JsonProperty("SECURITY_DEPOSIT")
//    private Integer securityDeposit;
//
//    @Column(name = "Excess_Rental")
//	@JsonProperty("EXCESS_RENTAL")
//    private Integer excessRental;
//
//    @Column(name = "Total_Amount")
//	@JsonProperty("TOTAL_AMOUNT")
//    private Integer totalAmount;
//
//    @Column(name = "Confirmation_Code")
//	@JsonProperty("CONFIRMATION_CODE")
//    private String confirmationCode;
//
//    @Column(name = "Accepted", nullable = false)
//	@JsonProperty("ACCEPTED")
//    private Boolean Accepted = false;
//
//    @Column(name = "Approved_Timestamp")
//	@JsonProperty("APPROVED_TIMESTAMP")
//    private Timestamp approvedTimestamp;
//
//    @Column(name = "plan")
//	@JsonProperty("PLAN")
//    private String plan;
//
//    @Column(name = "agreement_link")
//	@JsonProperty("AGREEMENT_LINK")
//    private String agreementLink;
//
//    @Column(name = "document_id")
//	@JsonProperty("DOCUMENT_ID")
//    private String documentId;
//
//
//}