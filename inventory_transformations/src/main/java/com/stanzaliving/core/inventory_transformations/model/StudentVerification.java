package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
@Table(name = "STUDENT_VERIFICATION")
public class StudentVerification {

	@Id
	private String studentID;
	@JsonBackReference
	@JoinColumn(name = "STUDENT_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Student student;
	
//	@JoinColumn(name = "STUDENT_ID")
//	@OneToOne(fetch = FetchType.LAZY)
//	@MapsId
//	private StudentOnboardingDetails studentOnboardingDetails;
//	
	@Column(name = "AADHAR")
	private StudentDocumentVerification studentAadharVerification;
	
	@Column(name = "PAN")
	private StudentDocumentVerification studentPanVerification;
	
	@Column(name = "OTHER_ID")
	private StudentDocumentVerification studentOtherIdVerification;
	
	@Column(name = "ACCOUNT_NUMBER")
	private StudentDocumentVerification studentaccountNumberVerification;
	
	@Column(name  = "NOC")
	private StudentDocumentVerification studentNocVerification;
	
	@Column(name = "POLICE_VERIFICATION")
	private StudentDocumentVerification studentPoliceVerification;
	
	@Column(name = "USER_STATUS")
	private StudentFinalVerificationStatus studentFinalVerificationStatus;
	
	@Column(name = "AADHAR_RR")
	private String aadharRejectedReason;
	
	@Column(name = "PAN_RR")
	private String panCardRejectedReason;
	
	@Column(name = "OTHER_ID_RR")
	private String otherIdRejectedReason;
	
	@Column(name = "ACCOUNT_NUMBER_RR")
	private String accountNumberRejectedReason;
	
	@Column(name = "NOC_RR")
	private String nocRejectedReason;
	
	@Column(name = "POLICE_VERIFICATION_RR")
	private String policeVerificationRejectedReason;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public StudentDocumentVerification getStudentAadharVerification() {
		return studentAadharVerification;
	}

	public void setStudentAadharVerification(StudentDocumentVerification studentAadharVerification) {
		this.studentAadharVerification = studentAadharVerification;
	}

	public StudentDocumentVerification getStudentPanVerification() {
		return studentPanVerification;
	}

	public void setStudentPanVerification(StudentDocumentVerification studentPanVerification) {
		this.studentPanVerification = studentPanVerification;
	}

	public StudentDocumentVerification getStudentOtherIdVerification() {
		return studentOtherIdVerification;
	}

	public void setStudentOtherIdVerification(StudentDocumentVerification studentOtherIdVerification) {
		this.studentOtherIdVerification = studentOtherIdVerification;
	}

	public StudentDocumentVerification getStudentaccountNumberVerification() {
		return studentaccountNumberVerification;
	}

	public void setStudentaccountNumberVerification(StudentDocumentVerification studentaccountNumberVerification) {
		this.studentaccountNumberVerification = studentaccountNumberVerification;
	}

	public StudentDocumentVerification getStudentNocVerification() {
		return studentNocVerification;
	}

	public void setStudentNocVerification(StudentDocumentVerification studentNocVerification) {
		this.studentNocVerification = studentNocVerification;
	}

	public StudentDocumentVerification getStudentPoliceVerification() {
		return studentPoliceVerification;
	}

	public void setStudentPoliceVerification(StudentDocumentVerification studentPoliceVerification) {
		this.studentPoliceVerification = studentPoliceVerification;
	}

	public StudentFinalVerificationStatus getStudentFinalVerificationStatus() {
		return studentFinalVerificationStatus;
	}

	public void setStudentFinalVerificationStatus(StudentFinalVerificationStatus studentFinalVerificationStatus) {
		this.studentFinalVerificationStatus = studentFinalVerificationStatus;
	}

	public String getAadharRejectedReason() {
		return aadharRejectedReason;
	}

	public void setAadharRejectedReason(String aadharRejectedReason) {
		this.aadharRejectedReason = aadharRejectedReason;
	}

	public String getPanCardRejectedReason() {
		return panCardRejectedReason;
	}

	public void setPanCardRejectedReason(String panCardRejectedReason) {
		this.panCardRejectedReason = panCardRejectedReason;
	}

	public String getOtherIdRejectedReason() {
		return otherIdRejectedReason;
	}

	public void setOtherIdRejectedReason(String otherIdRejectedReason) {
		this.otherIdRejectedReason = otherIdRejectedReason;
	}

	public String getAccountNumberRejectedReason() {
		return accountNumberRejectedReason;
	}

	public void setAccountNumberRejectedReason(String accountNumberRejectedReason) {
		this.accountNumberRejectedReason = accountNumberRejectedReason;
	}

	public String getNocRejectedReason() {
		return nocRejectedReason;
	}

	public void setNocRejectedReason(String nocRejectedReason) {
		this.nocRejectedReason = nocRejectedReason;
	}

	public String getPoliceVerificationRejectedReason() {
		return policeVerificationRejectedReason;
	}

	public void setPoliceVerificationRejectedReason(String policeVerificationRejectedReason) {
		this.policeVerificationRejectedReason = policeVerificationRejectedReason;
	}
	
	
}
	
	
	
