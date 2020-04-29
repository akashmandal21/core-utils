package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PENALTY_AUDIT")
public class PenaltyAudit {
	
	@Id
	@GeneratedValue
	@Column(name = "PENALTY_AUDIT_ID")
	private int penaltyAuditId;
	
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
