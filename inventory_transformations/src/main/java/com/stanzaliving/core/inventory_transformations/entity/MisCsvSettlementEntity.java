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
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "VALUE_DATE")
	@JsonProperty("VALUE_DATE")
    private Date valueDate;

    @Column(name = "DESCRIPTION")
	@JsonProperty("DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "CR_DR")
	@JsonProperty("CR_DR")
    private String crDr;

    @Column(name = "TRANSACTION_POSTED_DATE")
	@JsonProperty("TRANSACTION_POSTED_DATE")
    private Date transactionPostedDate;

    @Column(name = "AVAILABLE_AMOUNT")
	@JsonProperty("AVAILABLE_AMOUNT")
    private Double availableAmount;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    
}