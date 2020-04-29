package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BOOKING")
public class Booking implements Comparable<Booking>{

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_ID")
	private Integer bookingId;

	@OneToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "LEAD_ID")
	private Lead lead;

	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	@ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "TEMPORARY_STUDENT_ID")
	private TemporaryStudent temporaryStudent;

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

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "UPGRADE_ID")
	private Upgrade upgrade;

	@Column(name = "UPGRADE_DESCRIPTION")
	private String upgradeDescription;

	@Column(name = "CONTRACT_ID")
	private int contractId;

	@Column(name = "INVENTORY_ID")
	private Integer inventoryId;

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

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "ROOM_ID")
	private Room room;

	@OneToMany(mappedBy = "booking", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<BookingAttribute> bookingAttributes = new HashSet<>(0);

	@OneToMany(mappedBy = "booking", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<BookingService> bookingServices = new HashSet<>(0);

	@OneToOne(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private BookingCommercials bookingCommercials;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "REVISE_AT")
	private Date reviseAt;

	@Column(name = "CREATED")
	private Date created = new Date();

	@Column(name = "LAST_REMINDED_DATE")
	private Date lastRemindedDate;

	@Column(name = "LAST_REMINDED_COUNT")
	private int reminderCount;

	@Column(name = "AUTO_CANCEL_TIME")
	private Date autoCancelTime;

	@Column(name = "BOOKING_TYPE")
	private int bookingType;
	
	@Getter
	@Setter
	@Column(name = "LOCK_IN")
	private String lockIn;

	@Getter
	@Setter
	@Column(name = "LOCK_IN_MONTHS")
	private Integer lockInMonths;
	
	@Getter
	@Setter
	@Column(name = "BOOKING_SUBSTATUS")
	private BookingSubStatus bookingSubStatus;

	@Column(name = "ACTUAL_CONTRACT_END_DATE")
	private Date actualContractEndDate;
	
	@Column(name = "HAS_MOVED_IN")
    private Boolean hasMovedIn = Boolean.FALSE;

	@Column(name = "IN_PROGRESS")
	private Boolean inProgress = Boolean.FALSE;

	public Boolean getInProgress() {
		return inProgress;
	}

	public void setInProgress(Boolean inProgress) {
		this.inProgress = inProgress;
	}

	public Date getActualContractEndDate() {
		return actualContractEndDate;
	}

	public void setActualContractEndDate(Date actualContractEndDate) {
		this.actualContractEndDate = actualContractEndDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public TemporaryStudent getTemporaryStudent() {
		return temporaryStudent;
	}

	public void setTemporaryStudent(TemporaryStudent temporaryStudent) {
		this.temporaryStudent = temporaryStudent;
	}

	public SpecialRequest getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(SpecialRequest specialRequest) {
		this.specialRequest = specialRequest;
	}

	public Upgrade getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Upgrade upgrade) {
		this.upgrade = upgrade;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Set<BookingAttribute> getBookingAttributes() {
		return bookingAttributes;
	}

	public void setBookingAttributes(Set<BookingAttribute> bookingAttributes) {
		this.bookingAttributes = bookingAttributes;
	}

	public Set<BookingService> getBookingServices() {
		return bookingServices;
	}

	public void setBookingServices(Set<BookingService> bookingServices) {
		this.bookingServices = bookingServices;
	}

	public BookingCommercials getBookingCommercials() {
		return bookingCommercials;
	}

	public void setBookingCommercials(BookingCommercials bookingCommercials) {
		this.bookingCommercials = bookingCommercials;
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

	public Date getAutoCancelTime() {
		return autoCancelTime;
	}

	public void setAutoCancelTime(Date autoCancelTime) {
		this.autoCancelTime = autoCancelTime;
	}

	public int getBookingType() {
		return bookingType;
	}

	public void setBookingType(int bookingType) {
		this.bookingType = bookingType;
	}

	public Boolean getHasMovedIn() {
		return hasMovedIn;
	}

	public void setHasMovedIn(Boolean hasMovedIn) {
		this.hasMovedIn = hasMovedIn;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	@Override
	public int compareTo(Booking o) {
		return this.getBookingId().compareTo(o.getBookingId());
	}
}
