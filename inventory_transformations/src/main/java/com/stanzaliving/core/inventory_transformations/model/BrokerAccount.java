package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BROKER_ACCOUNT")
public class BrokerAccount {

	@Id()
	@Column(name="ID")
	private int id;
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="BROKER_ID")
	private Broker brokerId;
	
	@Column(name ="RAZORPAYX_ID", unique = true)
	private String razorpayId;

	@Column(name="ACCOUNT_NUMBER",nullable=false)
	private String accountNumber;
	
	@Column(name="ACCOUNT_NAME",nullable=false)
	private String accountName;	
	
	@Column(name="IFSC_CODE",nullable=false)
	private String ifscCode;
	
	@Column(name="BANK_NAME",nullable=false)
	private String bankName;
	
	@Column(name="RAZORPAYX_BANK_ACCOUNT_ID")
	private String faId;
	
	@Column(name="RAZORPAYX_VPA_ACCOUNT_ID")
	private String vpaId;

	@Column(name = "VPA")
	private String vpa;

	@Column(name="ACTIVE",nullable=false)
	private boolean active;
	
	@Column(name="VERIFIED",nullable=false)
	private boolean verified;

		
}
