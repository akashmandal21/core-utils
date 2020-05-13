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
	@JsonProperty("security_carry_forward_id")
    private Integer securityCarryForwardId;

    @Column(name = "ISSUE_DATE")
	@JsonProperty("issue_date")
    private Timestamp issueDate;

    @Column(name = "MENTIONED_AMOUNT")
	@JsonProperty("mentioned_amount")
    private Double mentionedAmount;

    @Column(name = "RECEIPT_ID")
	@JsonProperty("receipt_id")
    private String receiptId;

    @Column(name = "SECURITY_AMOUNT_CARRY_FORWADED")
	@JsonProperty("security_amount_carry_forwaded")
    private Double securityAmountCarryForwaded;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}