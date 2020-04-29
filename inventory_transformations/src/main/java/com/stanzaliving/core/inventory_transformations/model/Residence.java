package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "RESIDENCE")
public class Residence {

	@Override
	public String toString() {
		return "[residenceId=" + residenceId +"\n" +"bufferPrice=" + bufferPrice +"\n" + "gstIn=" + gstIn +"\n" + "cgst=" + cgst 
				+"\n" + "sgst="+ sgst +"\n" + "igst=" + igst + "]";
	}

	@Id
	@GeneratedValue
	@Column(name = "RESIDENCE_ID")
	private int residenceId;

	@Column(name = "HOSTEL_ID")
	private int hostelId;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "PREVIOUS_ALIAS", nullable = true)
	private String previousAlias;

	@Column(name = "CODE", nullable = false, unique = true)
	private String code;

	@Column(name = "GENDER", nullable = false)
	private Gender gender;

	@Column(name = "PROPERTY_CATEGORY", nullable = false)
	private PropertyCategory propertyCategory;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MICROMARKET_ID")
	private Micromarket micromarket;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RESIDENCE_RC_ID")
	private ResidenceRc residenceRc;

//MADE EAGER ##CHECK FOR OPTIMZN
	@OneToMany(mappedBy = "residence", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<ResidenceService> residenceServices = new HashSet<>(0);

	@OneToMany(mappedBy = "residence", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResidenceOccupancy> residenceOccupancies = new HashSet<>(0);

	@OneToMany(mappedBy = "residence", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResidenceAttribute> residenceAttributes = new HashSet<>(0);

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "RESIDENCE_SUPPLEMENTARY_DETAIL_ID")
	private ResidenceSupplementaryDetails residenceSupplementaryDetails;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RESIDENCE_PAYMENT_TERM", joinColumns = {
			@JoinColumn(name = "RESIDENCE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PAYMENT_TERM_ID") })
	private Set<PaymentTerm> paymentTerms = new HashSet<>(0);

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "RESIDENCE_CONTRACT_TYPE", joinColumns = { @JoinColumn(name = "RESIDENCE_ID") }, inverseJoinColumns = {
//			@JoinColumn(name = "CONTRACT_ID") })
//	private Set<Contract> contracts = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RESIDENCE_CONSUMABLES", joinColumns = {
			@JoinColumn(name = "RESIDENCE_ID") }, inverseJoinColumns = { @JoinColumn(name = "CONSUMABLES_ID") })
	private Set<Consumables> consumables = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RESIDENCE_FIXTURES", joinColumns = { @JoinColumn(name = "RESIDENCE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "FIXTURES_ID") })
	private Set<Fixtures> fixtures = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RESIDENCE_ANCILLARY_SERVICES", joinColumns = {
			@JoinColumn(name = "RESIDENCE_ID") }, inverseJoinColumns = { @JoinColumn(name = "ANCILLARY_SERVICES_ID") })
	private Set<AncillaryServices> ancillaryServices = new HashSet<>(0);

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "RESIDENCE_ADDRESS_ID")
	private Address address;

	@ElementCollection
	@CollectionTable(name = "RESIDENCE_FLOORS", joinColumns = @JoinColumn(name = "RSIDENCE_ID"))
	@Column(name = "FLOOR")
	private Set<String> floors = new HashSet<>();

	@Column(name = "BUFFER_PRICE", nullable = true)
	private int bufferPrice;

//	@Column(name = "REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
//	private int refundableSecurityDeposit;
//
//	@Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
//	private int nonRefundableSecurityDeposit;
//
//	@Column(name = "ADMIN_CHARGES", nullable = true)
//	private int adminCharges;

	@Column(name = "DETAILS_COMPLETED", nullable = false)
	private boolean detailsCompleted = false;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;

	@Column(name = "INTERNATIONAL_STUDENT_ALLOWED", nullable = false)
	private boolean internationalStudentAllowed = true;

//	@Column(name = "RETENTION_BOOKING_AMOUNT", nullable = true)
//	private double retentionBookingAmount;

	@Column(name = "GST_IN")
	private String gstIn;

	@Column(name = "CGST")
	private double cgst;

	@Column(name = "SGST")
	private double sgst;

	@Column(name = "IGST")
	private double igst;

//	@Column(name = "ADVANCE_RENTAL",nullable = true)
//	private int advanceRental;
	
	@Column(name = "PROPERTY_TYPE", nullable = false)
	private PropertyType propertyType;
	
	@Column(name="IS_TEST_HOUSE")
	private boolean isTestHouse;
	
	@Column(name="PARENT_COMPANY")
	private ParentCompany parentCompany;
	
	@Column(name = "ROFR")
	private boolean rofr;
	
	@Column (name = "AUTO_CANCELLATION_DAYS")
	private int autoCancellationDays;

	public int getAutoCancellationDays() {
		return autoCancellationDays;
	}

	public void setAutoCancellationDays(int autoCancellationDays) {
		this.autoCancellationDays = autoCancellationDays;
	}

	public boolean isRofr() {
		return rofr;
	}

	public void setRofr(boolean rofr) {
		this.rofr = rofr;
	}

	public boolean isTestHouse() {
		return isTestHouse;
	}

	public void setTestHouse(boolean isTestHouse) {
		this.isTestHouse = isTestHouse;
	}

	public int getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(int residenceId) {
		this.residenceId = residenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreviousAlias() {
		return previousAlias;
	}

	public void setPreviousAlias(String previousAlias) {
		this.previousAlias = previousAlias;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public PropertyCategory getPropertyCategory() {
		return propertyCategory;
	}

	public void setPropertyCategory(PropertyCategory propertyCategory) {
		this.propertyCategory = propertyCategory;
	}

	public Micromarket getMicromarket() {
		return micromarket;
	}

	public void setMicromarket(Micromarket micromarket) {
		this.micromarket = micromarket;
	}

	public Set<ResidenceService> getResidenceServices() {
		return residenceServices;
	}

	public void setResidenceServices(Set<ResidenceService> residenceServices) {
		this.residenceServices = residenceServices;
	}

	public Set<ResidenceOccupancy> getResidenceOccupancies() {
		return residenceOccupancies;
	}

	public void setResidenceOccupancies(Set<ResidenceOccupancy> residenceOccupancies) {
		this.residenceOccupancies = residenceOccupancies;
	}

	public Set<ResidenceAttribute> getResidenceAttributes() {
		return residenceAttributes;
	}

	public void setResidenceAttributes(Set<ResidenceAttribute> residenceAttributes) {
		this.residenceAttributes = residenceAttributes;
	}

	public Set<PaymentTerm> getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(Set<PaymentTerm> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

//	public Set<Contract> getContracts() {
//		return contracts;
//	}
//
//	public void setContracts(Set<Contract> contracts) {
//		this.contracts = contracts;
//	}

	public Set<Consumables> getConsumables() {
		return consumables;
	}

	public void setConsumables(Set<Consumables> consumables) {
		this.consumables = consumables;
	}

	public Set<Fixtures> getFixtures() {
		return fixtures;
	}

	public void setFixtures(Set<Fixtures> fixtures) {
		this.fixtures = fixtures;
	}

	public Set<AncillaryServices> getAncillaryServices() {
		return ancillaryServices;
	}

	public void setAncillaryServices(Set<AncillaryServices> ancillaryServices) {
		this.ancillaryServices = ancillaryServices;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<String> getFloors() {
		return floors;
	}

	public void setFloors(Set<String> floors) {
		this.floors = floors;
	}

	public int getBufferPrice() {
		return bufferPrice;
	}

	public void setBufferPrice(int bufferPrice) {
		this.bufferPrice = bufferPrice;
	}

//	public int getRefundableSecurityDeposit() {
//		return refundableSecurityDeposit;
//	}
//
//	public void setRefundableSecurityDeposit(int refundableSecurityDeposit) {
//		this.refundableSecurityDeposit = refundableSecurityDeposit;
//	}
//
//	public int getNonRefundableSecurityDeposit() {
//		return nonRefundableSecurityDeposit;
//	}
//
//	public void setNonRefundableSecurityDeposit(int nonRefundableSecurityDeposit) {
//		this.nonRefundableSecurityDeposit = nonRefundableSecurityDeposit;
//	}
//
//	public int getAdminCharges() {
//		return adminCharges;
//	}
//
//	public void setAdminCharges(int adminCharges) {
//		this.adminCharges = adminCharges;
//	}

	public boolean isDetailsCompleted() {
		return detailsCompleted;
	}

	public void setDetailsCompleted(boolean detailsCompleted) {
		this.detailsCompleted = detailsCompleted;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean getInternationalStudentAllowed() {
		return internationalStudentAllowed;
	}

	public void setInternationalStudentAllowed(boolean internationalStudentAllowed) {
		this.internationalStudentAllowed = internationalStudentAllowed;
	}

//	public double getRetentionBookingAmount() {
//		return retentionBookingAmount;
//	}
//
//	public void setRetentionBookingAmount(double retentionBookingAmount) {
//		this.retentionBookingAmount = retentionBookingAmount;
//	}

	public String getGstIn() {
		return gstIn;
	}

	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getIgst() {
		return igst;
	}

	public void setIgst(double igst) {
		this.igst = igst;
	}

//	public int getAdvanceRental() {
//		return advanceRental;
//	}
//
//	public void setAdvanceRental(int advanceRental) {
//		this.advanceRental = advanceRental;
//	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	public ResidenceRc getResidenceRc() {
		return residenceRc;
	}

	public void setResidenceRc(ResidenceRc residenceRc) {
		this.residenceRc = residenceRc;
	}

	public ResidenceSupplementaryDetails getResidenceSupplementaryDetails() {
		return residenceSupplementaryDetails;
	}

	public void setResidenceSupplementaryDetails(ResidenceSupplementaryDetails residenceSupplementaryDetails) {
		this.residenceSupplementaryDetails = residenceSupplementaryDetails;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public ParentCompany getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(ParentCompany parentCompany) {
		this.parentCompany = parentCompany;
	}

}
