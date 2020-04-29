package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STUDENT_ONBOARDING_DETAILS")
public class StudentOnboardingDetails {
	
	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name = "STUDENT_ID")
	private String studentId;
	
	@Column(name = "AADHAR")
	private String aadhar;
	
	@Column(name = "AADHAR_PHOTO")
	private String aadharPhoto;
	
	@Column(name = "PAN_TYPE")
	private String panType;
	
	@Column(name = "PAN_CARD")
	private String panCard;
	
	@Column(name = "PAN_CARD_PHOTO")
	private String panCardPhoto;
	
	@Column(name = "OTHER_ID")
	private String otherId;
	
	@Column(name = "OTHER_ID_PHOTO")
	private String otherIdPhoto;
	
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "ACCOUNT_NAME")
	private String accountName;

	@Column(name = "IFSC_CODE")
	private String ifscCode;
	
	@Column(name = "CANCELLED_CHEQUE")
	private String cancelledCheque;
	
	@Column(name = "POLICE_VERIFICATION")
	private String policeVerification;
	
	@Column(name = "NOC")
	private String noc;
	
	@Column(name = "BIOMETRIC_ID")
	private String biometricId;
	
	@Column(name = "STATUS")
	private String status;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_CONSUMABLES", joinColumns = { @JoinColumn(name = "STUDENT_ONBOARDING_DETAILS_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "CONSUMABLES_ID") })
	private Set<Consumables> consumables = new HashSet<>(0);
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_ROOM_IMAGES", joinColumns = { @JoinColumn(name = "STUDENT_ONBOARDING_DETAILS_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "IMAGE_ID") })
	private Set<Image> images = new HashSet<>(0);

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="ELEC_METER_READING")
	private String elecMeterReading;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="BOOKING_ID")
	private Integer bookingId;

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPanType() {
		return panType;
	}

	public void setPanType(String panType) {
		this.panType = panType;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getOtherId() {
		return otherId;
	}

	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCancelledCheque() {
		return cancelledCheque;
	}

	public void setCancelledCheque(String cancelledCheque) {
		this.cancelledCheque = cancelledCheque;
	}

	public String getPoliceVerification() {
		return policeVerification;
	}

	public void setPoliceVerification(String policeVerification) {
		this.policeVerification = policeVerification;
	}

	public String getNoc() {
		return noc;
	}

	public void setNoc(String noc) {
		this.noc = noc;
	}

	public String getBiometricId() {
		return biometricId;
	}

	public void setBiometricId(String biometricId) {
		this.biometricId = biometricId;
	}

	public Set<Consumables> getConsumables() {
		return consumables;
	}

	public void setConsumables(Set<Consumables> consumables) {
		this.consumables = consumables;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public String getAadharPhoto() {
		return aadharPhoto;
	}

	public void setAadharPhoto(String aadharPhoto) {
		this.aadharPhoto = aadharPhoto;
	}

	public String getPanCardPhoto() {
		return panCardPhoto;
	}

	public void setPanCardPhoto(String panCardPhoto) {
		this.panCardPhoto = panCardPhoto;
	}

	public String getOtherIdPhoto() {
		return otherIdPhoto;
	}

	public void setOtherIdPhoto(String otherIdPhoto) {
		this.otherIdPhoto = otherIdPhoto;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getElecMeterReading() {
		return elecMeterReading;
	}

	public void setElecMeterReading(String elecMeterReading) {
		this.elecMeterReading = elecMeterReading;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}
}