package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BOOKING_AUDIT")
public class BookingAudit {

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_AUDIT_ID")
	private int bookingAuditId;

	@OneToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "BOOKING")
	private Booking booking;

	@Column(name = "STUDENT_ID")
	private String student;

	@Column(name = "TEMPORARY_STUDENT_ID")
	private int temporaryStudent;

	@Column(name = "PHONE", unique = true)
	private String phone;

	@Column(name = "CONTRACT_START_DATE")
	private Date contractStartDate;

	@Column(name = "CONTRACT_END_DATE")
	private Date contractEndDate;

	@Column(name = "CONFIRMATION_DATE")
	private Date confirmationDate;

	@Column(name = "STARTS_MID_MONTH")
	private boolean startsMidMonth;

	@Column(name = "MOVE_IN_DATE")
	private Date moveInDate;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "SPECIAL_REQUEST_ID")
	private SpecialRequest specialRequest;

	@Column(name = "SPECIAL_REQUEST_DESCRIPTION")
	private String specialRequestDescription;

	@Column(name = "UPGRADE_DESCRIPTION")
	private String upgradeDescription;

	@Column(name = "CONTRACT_ID")
	private int contractId;

	@Column(name = "CONTRACT_NAME")
	private String contractName;

	@Column(name = "CONTRACT_MONTHS")
	private double contractMonths;

	@Column(name = "PAYMENT_TERM_ID")
	private int paymentTermId;

	@Column(name = "PAYMENT_TERM_NAME")
	private String paymentTermName;

	@Column(name = "PAYMENT_TERM_INSTALLMENTS")
	private int paymentTermInstallments;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "PAYMENT_MODE_ID")
	private PaymentMode paymentMode;

	@Column(name = "CHEQUE_NUMBER")
	private String chequeNumber;

	@Column(name = "CHEQUE_PHOTO")
	private String chequePhoto;

	@Column(name = "BOOKING_STATUS")
	private String bookingStatus;

	@Column(name = "ROOM_ID")
	private String room;

	@OneToMany(mappedBy = "bookingAudit", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<BookingAttributeAudit> bookingAttributeAudits = new HashSet<>(0);

	@OneToMany(mappedBy = "bookingAudit", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<BookingServiceAudit> bookingServiceAudits = new HashSet<>(0);

	@OneToOne(mappedBy = "bookingAudit", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private BookingCommercialsAudit bookingCommercialsAudit;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "REVISE_AT")
	private Date reviseAt;

	@Column(name = "CREATED")
	private Date created = new Date();

	@Column(name = "UPDATED")
	private Date updated = new Date();

	@Column(name = "LAST_REMINDED_DATE")
	private Date lastRemindedDate;

	@Column(name = "LAST_REMINDED_COUNT")
	private int reminderCount;
	
	@Getter
	@Setter
	@Column(name = "BOOKING_DATA")
	private boolean bookingData;
	
	@Column(name = "INVENTORY_ID")
	private Integer inventoryId;
	
	@Column(name = "TYPE")
	private String type;

	public int getBookingAuditId() {
		return bookingAuditId;
	}

	public void setBookingAuditId(int bookingAuditId) {
		this.bookingAuditId = bookingAuditId;
	}

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public Date getMoveInDate() {
		return moveInDate;
	}

	public void setMoveInDate(Date moveInDate) {
		this.moveInDate = moveInDate;
	}

	public String getSpecialRequestDescription() {
		return specialRequestDescription;
	}

	public void setSpecialRequestDescription(String specialRequestDescription) {
		this.specialRequestDescription = specialRequestDescription;
	}

	public SpecialRequest getSpecialRequest() {
		return specialRequest;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public void setSpecialRequest(SpecialRequest specialRequest) {
		this.specialRequest = specialRequest;
	}

	public String getUpgradeDescription() {
		return upgradeDescription;
	}

	public void setUpgradeDescription(String upgradeDescription) {
		this.upgradeDescription = upgradeDescription;
	}

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public double getContractMonths() {
		return contractMonths;
	}

	public void setContractMonths(double contractMonths) {
		this.contractMonths = contractMonths;
	}

	public int getPaymentTermId() {
		return paymentTermId;
	}

	public void setPaymentTermId(int paymentTermId) {
		this.paymentTermId = paymentTermId;
	}

	public String getPaymentTermName() {
		return paymentTermName;
	}

	public void setPaymentTermName(String paymentTermName) {
		this.paymentTermName = paymentTermName;
	}

	public int getPaymentTermInstallments() {
		return paymentTermInstallments;
	}

	public void setPaymentTermInstallments(int paymentTermInstallments) {
		this.paymentTermInstallments = paymentTermInstallments;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequePhoto() {
		return chequePhoto;
	}

	public void setChequePhoto(String chequePhoto) {
		this.chequePhoto = chequePhoto;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Set<BookingAttributeAudit> getBookingAttributeAudits() {
		return bookingAttributeAudits;
	}

	public void setBookingAttributeAudits(Set<BookingAttributeAudit> bookingAttributeAudits) {
		this.bookingAttributeAudits = bookingAttributeAudits;
	}

	public Set<BookingServiceAudit> getBookingServiceAudits() {
		return bookingServiceAudits;
	}

	public void setBookingServiceAudits(Set<BookingServiceAudit> bookingServiceAudits) {
		this.bookingServiceAudits = bookingServiceAudits;
	}

	public BookingCommercialsAudit getBookingCommercialsAudit() {
		return bookingCommercialsAudit;
	}

	public void setBookingCommercialsAudit(BookingCommercialsAudit bookingCommercialsAudit) {
		this.bookingCommercialsAudit = bookingCommercialsAudit;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getReviseAt() {
		return reviseAt;
	}

	public void setReviseAt(Date reviseAt) {
		this.reviseAt = reviseAt;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public boolean isStartsMidMonth() {
		return startsMidMonth;
	}

	public void setStartsMidMonth(boolean startsMidMonth) {
		this.startsMidMonth = startsMidMonth;
	}

	public Date getConfirmationDate() {
		return confirmationDate;
	}

	public void setConfirmationDate(Date confirmationDate) {
		this.confirmationDate = confirmationDate;
	}

	public Date getLastRemindedDate() {
		return lastRemindedDate;
	}

	public void setLastRemindedDate(Date lastRemindedDate) {
		this.lastRemindedDate = lastRemindedDate;
	}

	public int getReminderCount() {
		return reminderCount;
	}

	public void setReminderCount(int reminderCount) {
		this.reminderCount = reminderCount;
	}

	public int getTemporaryStudent() {
		return temporaryStudent;
	}

	public void setTemporaryStudent(int temporaryStudent) {
		this.temporaryStudent = temporaryStudent;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
