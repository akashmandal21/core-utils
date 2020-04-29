package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PENALTY")
public class Penalty {
	
	@Id
	@Column(name  = "STUDENT_ID")
	private String studentId;
	
	@Column(name = "PENALTY_AMOUNT")
	private double penaltyAmount;
	
	@Column(name = "INVOICE_AMOUNT")
	private double invoiceAmount;
	
	@Column(name = "AMOUNT_PAID")
	private double amountPaid;
	
	@Column(name = "PENALTY_DAYS")
	private int penaltyDays;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "PER_DAY_PENALTY")
	private double perDayPenalty;
	
	@Column(name = "DUE_DATE")
	private Date dueDate;
	
}
