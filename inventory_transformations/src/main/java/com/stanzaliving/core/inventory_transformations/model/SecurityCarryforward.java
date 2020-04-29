package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SECURITY_CARRY_FORWARD")
public class SecurityCarryforward {

	@Id
	@GeneratedValue
	@Column(name = "SECURITY_CARRY_FORWARD_ID")
	private int securityCarryforwardId;

	@OneToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.MERGE)
	@JoinColumn(name = "BOOKING_ID")
	private Booking booking;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "MENTIONED_AMOUNT")
	private double mentionedAmount;

	@Column(name = "SECURITY_AMOUNT_CARRY_FORWADED")
	private double securityAmountCarryForwaded;

	@Column(name = "RECEIPT_ID")
	private String receiptId;

	@Column(name = "ISSUE_DATE")
	private Date issueDate;

	public int getSecurityCarryforwardId() {
		return securityCarryforwardId;
	}

	public void setSecurityCarryforwardId(int securityCarryforwardId) {
		this.securityCarryforwardId = securityCarryforwardId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getMentionedAmount() {
		return mentionedAmount;
	}

	public void setMentionedAmount(double mentionedAmount) {
		this.mentionedAmount = mentionedAmount;
	}

	public double getSecurityAmountCarryForwaded() {
		return securityAmountCarryForwaded;
	}

	public void setSecurityAmountCarryForwaded(double securityAmountCarryForwaded) {
		this.securityAmountCarryForwaded = securityAmountCarryForwaded;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

}