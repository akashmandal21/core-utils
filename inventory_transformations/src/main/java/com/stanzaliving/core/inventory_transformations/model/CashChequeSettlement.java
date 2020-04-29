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
@Table(name = "CASH_CHEQUE_SETTLEMENT")
public class CashChequeSettlement {
	
	@Id
	@Column(name = "TRANSACTION_ID")
	private Integer transactionId;

	@Column(name = "SETTLEMENT_DATE")
	private Date settlementDate;
	
	@Column(name = "NARRATION")
	private String narration;

	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "MODE")
	private String mode;
	
	@Column(name ="SETTLEMENT_ID")
	private String settlementId;
	
	@Column(name = "STUDENT_ID")
	private String studentId;

}
