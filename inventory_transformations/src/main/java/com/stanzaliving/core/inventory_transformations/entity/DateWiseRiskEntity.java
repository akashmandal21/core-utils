package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "DATE_WISE_RISK")
@Data
@Entity
public class DateWiseRiskEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Id
    @Column(name = "DATA_DATE", insertable = false, nullable = false)
	@JsonProperty("DATA_DATE")
    private Date dataDate;

    @Column(name = "AMOUNT_DUE")
	@JsonProperty("AMOUNT_DUE")
    private Double amountDue;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "RISK_TYPE")
	@JsonProperty("RISK_TYPE")
    private Integer riskType;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "INVOICE_AMOUNT_DUE")
	@JsonProperty("INVOICE_AMOUNT_DUE")
    private Double invoiceAmountDue = 0D;

    
}