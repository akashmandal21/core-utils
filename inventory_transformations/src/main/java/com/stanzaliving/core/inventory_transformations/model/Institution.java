package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INSTITUTION")
public class Institution {

	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "INSTITUTION_ID", nullable = false, unique = true)
	private String institutionId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CODE", nullable = false, unique = true)
	private String code;

	@Column(name = "POC_NAME")
	private String pocName;

	@Column(name = "POC_PHONE")
	private String pocPhone;

	@Column(name = "POC_EMAIL")
	private String pocEmail;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "INSTITUTION_ADDRESS_ID")
	private Address address;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "INSTITUTION_RESIDENCES", joinColumns = @JoinColumn(name = "RSIDENCE_ID"))
	@Column(name = "RESIDENCES")
	private Set<String> residences = new HashSet<>();

	@OneToOne(mappedBy = "institution", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private InstitutionAccountingDetails accountingDetails;

	@OneToMany(mappedBy = "institution", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<InstitutionDocument> institutionDocuments = new HashSet<>(0);

	@Column(name = "TOTAL_INVENTORY", nullable = false)
	private int totalInventory;

	@Column(name = "TOTAL_PRICE", nullable = false)
	private int totalPrice;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;
	
	@Column(name = "ADVANCE_RENTAL_MONTHS", nullable = false)
	private int advanceRentalMonth;
	
	@Column(name="AGREEMENT_DETAILS")
	private String agreement;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public String getPocPhone() {
		return pocPhone;
	}

	public void setPocPhone(String pocPhone) {
		this.pocPhone = pocPhone;
	}

	public String getPocEmail() {
		return pocEmail;
	}

	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public Set<String> getResidences() {
		return residences;
	}

	public void setResidences(Set<String> residences) {
		this.residences = residences;
	}

	public InstitutionAccountingDetails getAccountingDetails() {
		return accountingDetails;
	}

	public void setAccountingDetails(InstitutionAccountingDetails accountingDetails) {
		this.accountingDetails = accountingDetails;
	}

	public Set<InstitutionDocument> getInstitutionDocuments() {
		return institutionDocuments;
	}

	public void setInstitutionDocuments(Set<InstitutionDocument> institutionDocuments) {
		this.institutionDocuments = institutionDocuments;
	}

	public int getTotalInventory() {
		return totalInventory;
	}

	public void setTotalInventory(int totalInventory) {
		this.totalInventory = totalInventory;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getAdvanceRentalMonth() {
		return advanceRentalMonth;
	}

	public void setAdvanceRentalMonth(int advanceRentalMonth) {
		this.advanceRentalMonth = advanceRentalMonth;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

}
