package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "SECURITY_CARRY_FORWARD")
public class SecurityCarryForwardEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SECURITY_CARRY_FORWARD_ID", insertable = false, nullable = false)
	@JsonProperty("SECURITY_CARRY_FORWARD_ID")
    private Integer securityCarryForwardId;

    @Column(name = "ISSUE_DATE")
	@JsonProperty("ISSUE_DATE")
    private Timestamp issueDate;

    @Column(name = "MENTIONED_AMOUNT")
	@JsonProperty("MENTIONED_AMOUNT")
    private Double mentionedAmount;

    @Column(name = "RECEIPT_ID")
	@JsonProperty("RECEIPT_ID")
    private String receiptId;

    @Column(name = "SECURITY_AMOUNT_CARRY_FORWADED")
	@JsonProperty("SECURITY_AMOUNT_CARRY_FORWADED")
    private Double securityAmountCarryForwaded;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}