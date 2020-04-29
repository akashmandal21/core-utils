package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EXCEPTION_DATA")
public class ExceptionData {
	
	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;

	@Column(name="SOURCE")
	private String source;

	@Column(name="MESSAGE")
	private String message;
	
	@Column(name="CREATED_DATE")
	private Date createdDate= new Date();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
