package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "INSTITUTION_ACCOUNTING_DETAILS")
public class InstitutionAccountingDetails {

	@Id()
	@Column(name = "ID")
	private int id;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTITUTION_ID")
	private Institution institution;

	@Column(name = "ACCOUNTS_POC", nullable = false)
	private String accountsPoc;

	@Column(name = "ACCOUNTS_Phone", nullable = false)
	private String accountsPhone;

	@Column(name = "ACCOUNTS_EMAIL", nullable = false)
	private String accountsEmail;

	@Column(name = "GST_NUMBER", nullable = false)
	private String gstNumber;
	
	@Column(name = "PAN_NUMBER", nullable = false)
	private String panNumber;

	public int getId() {
		return id;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountsPoc() {
		return accountsPoc;
	}

	public void setAccountsPoc(String accountsPoc) {
		this.accountsPoc = accountsPoc;
	}

	public String getAccountsPhone() {
		return accountsPhone;
	}

	public void setAccountsPhone(String accountsPhone) {
		this.accountsPhone = accountsPhone;
	}

	public String getAccountsEmail() {
		return accountsEmail;
	}

	public void setAccountsEmail(String accountsEmail) {
		this.accountsEmail = accountsEmail;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

}
