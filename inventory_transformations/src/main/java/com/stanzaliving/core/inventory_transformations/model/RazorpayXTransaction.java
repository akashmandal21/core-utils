package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RAZORPAYX_TRANSACTION")
public class RazorpayXTransaction {
	
	@Id()
	@GeneratedValue
	@Column(name="RAZORPAY_TRANS_ID")
	private int razorpayTransId;
	
	@Column(name="PAYOUT_ID")
	private String payoutId;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="CONTACT_ID")
	private String contactId;
	
	@Column(name="FUND_ACCOUNT_ID")
	private String faId;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="CREATED")
	private Date created;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="TYPE")
	private String type;
}
	