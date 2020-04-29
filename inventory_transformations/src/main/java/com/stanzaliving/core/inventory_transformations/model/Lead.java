package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LEAD")
public class Lead {

	@Id
	@GeneratedValue
	@Column(name = "LEAD_ID")
	private int leadId;

	@OneToOne(mappedBy = "lead", fetch = FetchType.LAZY, optional=true)
	private Booking booking;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE", nullable = false, unique = true)
	private String phone;

	@Column(name = "PHONE_VERIFIED", nullable = false)
	private boolean phoneVerified;

	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "RESIDENCE_ID")
	private Residence residence;

	@Column(name = "LEAD_OWNER_ID")
	private String leadOwnerId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name = "MICROMARKET_ID")
	private Micromarket micromarket;

	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name = "CITY_ID")
	private City city;

	@Column(name = "COLLEGE")
	private String college;
	
	@Column(name = "OCCUPANCY")
	private String occupancy;
	
	@Column(name = "LEAD_TYPE")
	private String leadType;

	@Column(name = "STANZA_POC_EMAIL")
	private String stanzaPOCEmail;

	@Column(name = "QUALIFICATION")
	private String qualification;

	@Column(name = "ZOHO_STATUS")
	private String zohoStatus;
	
	@Column(name = "ZOHO_ID")
	private String zohoId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "REFERRAL_ID")
	private String referralId;

	@Column(name = "REFERRAL_CATEGORY")
	private String referralCategory;

	@Column(name = "UTM_SOURCE")
	private String utmSource;

	@Column(name = "UTM_MEDIUM")
	private String utmMedium;

	@Column(name = "UTM_CAMPAIGN")
	private String utmCampaign;

	@Column(name = "UTM_TERM")
	private String utmTerm;

	@Column(name = "UTM_ADGROUP")
	private String utmAdgroup;

	@Column(name = "GCLID")
	private String gclId;

	@Column(name = "UTM_CONTENT")
	private String utmContent;

	@Column(name = "UTM_TARGET")
	private String utmTarget;

	@Column(name = "UTM_ADFORMAT")
	private String utmAdformat;

	@Column(name = "COMMISION_EARNED")
	private int commissionEarned;
	
	@Column(name = "GENDER")
	private Gender gender;

	@Column(name = "VISIT_DATE")
	private Date visitDate;
	
	@Column(name = "LAST_RESIDENCE_VISITED")
	private String lastResidenceVisited;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST, optional=true)
	@JoinColumn(name = "LEAD_MODE_ID")
	private LeadMode mode;
	
	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@Column(name = "BOOKED_DATE")
	private Date bookedDate;

	@Column(name ="LEAD_OWNER_ZOHO_ID")
	private String leadOwnerZohoId;

	public String getLeadOwnerZohoId() {
		return leadOwnerZohoId;
	}

	public void setLeadOwnerZohoId(String leadOwnerZohoId) {
		this.leadOwnerZohoId = leadOwnerZohoId;
	}

	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public boolean isPhoneVerified() {
		return phoneVerified;
	}

	public void setPhoneVerified(boolean phoneVerified) {
		this.phoneVerified = phoneVerified;
	}

	public String getStanzaPOCEmail() {
		return stanzaPOCEmail;
	}

	public void setStanzaPOCEmail(String stanzaPOCEmail) {
		this.stanzaPOCEmail = stanzaPOCEmail;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getZohoStatus() {
		return zohoStatus;
	}

	public void setZohoStatus(String zohoStatus) {
		this.zohoStatus = zohoStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getReferralId() {
		return referralId;
	}

	public void setReferralId(String referralId) {
		this.referralId = referralId;
	}

	public String getReferralCategory() {
		return referralCategory;
	}

	public void setReferralCategory(String referralCategory) {
		this.referralCategory = referralCategory;
	}

	public String getUtmSource() {
		return utmSource;
	}

	public void setUtmSource(String utmSource) {
		this.utmSource = utmSource;
	}

	public String getUtmMedium() {
		return utmMedium;
	}

	public void setUtmMedium(String utmMedium) {
		this.utmMedium = utmMedium;
	}

	public String getUtmCampaign() {
		return utmCampaign;
	}

	public void setUtmCampaign(String utmCampaign) {
		this.utmCampaign = utmCampaign;
	}

	public String getUtmTerm() {
		return utmTerm;
	}

	public void setUtmTerm(String utmTerm) {
		this.utmTerm = utmTerm;
	}

	public String getUtmAdgroup() {
		return utmAdgroup;
	}

	public void setUtmAdgroup(String utmAdgroup) {
		this.utmAdgroup = utmAdgroup;
	}

	public String getGclId() {
		return gclId;
	}

	public void setGclid(String gclid) {
		this.gclId = gclid;
	}

	public String getUtmContent() {
		return utmContent;
	}

	public void setUtmContent(String utmContent) {
		this.utmContent = utmContent;
	}

	public String getUtmTarget() {
		return utmTarget;
	}

	public void setUtmTarget(String utmTarget) {
		this.utmTarget = utmTarget;
	}

	public String getUtmAdformat() {
		return utmAdformat;
	}

	public void setUtmAdformat(String utmAdformat) {
		this.utmAdformat = utmAdformat;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public String getLeadOwnerId() {
		return leadOwnerId;
	}

	public void setLeadOwnerId(String leadOwnerId) {
		this.leadOwnerId = leadOwnerId;
	}

	public void setGclId(String gclId) {
		this.gclId = gclId;
	}

	public Micromarket getMicromarket() {
		return micromarket;
	}

	public void setMicromarket(Micromarket micromarket) {
		this.micromarket = micromarket;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getLeadType() {
		return leadType;
	}

	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getLastResidenceVisited() {
		return lastResidenceVisited;
	}

	public void setLastResidenceVisited(String lastResidenceVisited) {
		this.lastResidenceVisited = lastResidenceVisited;
	}

	public LeadMode getMode() {
		return mode;
	}

	public void setMode(LeadMode mode) {
		this.mode = mode;
	}

	public int getCommissionEarned() {
		return commissionEarned;
	}

	public void setCommissionEarned(int commissionEarned) {
		this.commissionEarned = commissionEarned;
	}

	public String getZohoId() {
		return zohoId;
	}

	public void setZohoId(String zohoId) {
		this.zohoId = zohoId;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

}