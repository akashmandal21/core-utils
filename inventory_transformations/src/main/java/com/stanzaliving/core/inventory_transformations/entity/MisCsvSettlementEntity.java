package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "MIS_CSV_SETTLEMENT")
public class MisCsvSettlementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "VALUE_DATE")
	@JsonProperty("value_date")
    private Date valueDate;

    @Column(name = "DESCRIPTION")
	@JsonProperty("description")
    private String DESCRIPTION;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("transaction_amount")
    private Double transactionAmount;

    @Column(name = "CR_DR")
	@JsonProperty("cr_dr")
    private String crDr;

    @Column(name = "TRANSACTION_POSTED_DATE")
	@JsonProperty("transaction_posted_date")
    private Date transactionPostedDate;

    @Column(name = "AVAILABLE_AMOUNT")
	@JsonProperty("available_amount")
    private Double availableAmount;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("settlement_id")
    private String settlementId;

    
}