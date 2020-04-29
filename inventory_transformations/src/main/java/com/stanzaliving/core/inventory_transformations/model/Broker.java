package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROKER")
public class Broker {
	
	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name = "MOBILE", nullable = false,unique=true)
	private String mobile;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "EMAIL", nullable = true)
	private String email;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;
	
	@Column(name = "CREATED_BY_NAME", nullable = false)
	private String createdByName;
	
	@Column(name = "CREATED_BY_PHONE", nullable = false)
	private String createdByPhone;

	@Column(name = "STATUS", nullable = true)
	private String status;

	@Column(name = "PAN_CARD", nullable = true)
	private String panCard;

	@Column(name = "PAN_CARD_UPLOADED", nullable = true)
	private boolean panCardUploaded;

	@Column(name = "GST", nullable = true)
	private String gstNumber;

	@Column(name="PAYTM_NUMBER",nullable=true)
	private String paytmNumber;

	@Column(name = "PREFERRED_PAYMENT_MODE", nullable = true)
	private BrokerPreferredPaymentMode preferredPaymentMode;
	
	@Column(name = "REFERRER_PAYTM_NUMBER", nullable = true)
	private String referrerPaytmNumber;
	
	@Column(name = "REFERRER_PAYMENT_METHOD", nullable = true)
	private String referrerPaymentMethod;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "BROKER_TYPE_ID")
	private BrokerType brokerType;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "BROKER_SLAB_ID")
	private BrokerSlab brokerSlab;
	
	@OneToMany(mappedBy="brokerId", cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	private Set<BrokerDocument> brokerDocuments = new HashSet<>(0);
	
	@OneToMany(mappedBy="brokerId", cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	private Set<BrokerLeadTransaction> brokerLeadTransactions = new HashSet<>(0);

	@Column(name = "TOTAL_LEADS", nullable = true)
	private int totalLeads;

	@Column(name = "TOTAL_CLOSURE", nullable = true)
	private int totalClosure;

	@Column(name = "TOTAL_EARNINGS", nullable = true)
	private int totalEarning;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@Column(name = "ENABLED")
	private boolean enabled;

	@Column(name = "UUID")
	private String uuid;

	@Column(name = "BROKER_QR_CODE")
	private String brokerQrCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String created_by) {
		this.createdBy = created_by;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public String getCreatedByPhone() {
		return createdByPhone;
	}

	public void setCreatedByPhone(String createdByPhone) {
		this.createdByPhone = createdByPhone;
	}

	public Set<BrokerLeadTransaction> getBrokerLeadTransactions() {
		return brokerLeadTransactions;
	}

	public void setBrokerLeadTransactions(Set<BrokerLeadTransaction> brokerLeadTransactions) {
		this.brokerLeadTransactions = brokerLeadTransactions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public boolean getPanCardUploaded() {
		return panCardUploaded;
	}

	public void setPanCardUploaded(boolean panCardUploaded) {
		this.panCardUploaded = panCardUploaded;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public BrokerType getBrokerType() {
		return brokerType;
	}

	public void setBrokerType(BrokerType brokerType) {
		this.brokerType = brokerType;
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

	public BrokerSlab getBrokerSlab() {
		return brokerSlab;
	}

	public void setBrokerSlab(BrokerSlab brokerSlab) {
		this.brokerSlab = brokerSlab;
	}

	public int getTotalClosure() {
		return totalClosure;
	}

	public void setTotalClosure(int totalClosure) {
		this.totalClosure = totalClosure;
	}

	public int getTotalEarning() {
		return totalEarning;
	}

	public void setTotalEarning(int totalEarning) {
		this.totalEarning = totalEarning;
	}

	public int getTotalLeads() {
		return totalLeads;
	}

	public void setTotalLeads(int totalLeads) {
		this.totalLeads = totalLeads;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<BrokerDocument> getBrokerDocuments() {
		return brokerDocuments;
	}

	public void setBrokerDocuments(Set<BrokerDocument> brokerDocuments) {
		this.brokerDocuments = brokerDocuments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getReferrerPaytmNumber() {
		return referrerPaytmNumber;
	}

	public void setReferrerPaytmNumber(String referrerPaytmNumber) {
		this.referrerPaytmNumber = referrerPaytmNumber;
	}

	public String getReferrerPaymentMethod() {
		return referrerPaymentMethod;
	}

	public void setReferrerPaymentMethod(String referrerPaymentMethod) {
		this.referrerPaymentMethod = referrerPaymentMethod;
	}

	public BrokerPreferredPaymentMode getPreferredPaymentMode() {
		return preferredPaymentMode;
	}

	public void setPreferredPaymentMode(BrokerPreferredPaymentMode preferredPaymentMode) {
		this.preferredPaymentMode = preferredPaymentMode;
	}

	public String getPaytmNumber() {
		return paytmNumber;
	}

	public void setPaytmNumber(String paytmNumber) {
		this.paytmNumber = paytmNumber;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getBrokerQrCode() {
		return brokerQrCode;
	}

	public void setBrokerQrCode(String brokerQrCode) {
		this.brokerQrCode = brokerQrCode;
	}

}