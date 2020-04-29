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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MIS_CSV_SETTLEMENT")
public class MisSettlement {
	
	@Id
	@Column(name = "TRANSACTION_ID")
	private Integer transactionId;

	@Column(name = "VALUE_DATE")
	private Date valueDate;
	
	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "TRANSACTION_AMOUNT")
	private Double transactionAmount;
	
	@Column(name = "CR_DR")
	private String crDr;
	
	@Column(name = "TRANSACTION_POSTED_DATE")
	private Date transactionPostedDate;
	
	@Column(name ="AVAILABLE_AMOUNT")
	private Double availableAmount;
	
	@Column(name="STUDENT_ID")
	private String studentId;
	
	@Column(name ="SETTLEMENT_ID")
	private String settlementId;


}
