package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;


@Entity
@Table(name = "CREDITCARD_TRANSACTION")
public class CreditCardTransaction {
	
	@Id
	@GeneratedValue
	@Column(name="CC_TRANSACTION_ID")
	private int id;
	
	@JoinColumn(name = "TRANSACTION_ID")
	@OneToOne(fetch = FetchType.EAGER)
	private Transaction transaction;
	
	@Column(name="REQUEST")
	private String request;
	
	@Column(name="BILL_NUMBER")
	private String billNumber;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	
}
