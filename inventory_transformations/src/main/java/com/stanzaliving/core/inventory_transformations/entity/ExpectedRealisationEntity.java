package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "EXPECTED_REALISATION")
public class ExpectedRealisationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXPECTED_REALISATION_ID", insertable = false, nullable = false)
	@JsonProperty("EXPECTED_REALISATION_ID")
    private Integer expectedRealisationId;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("EXECUTION_DATE")
    private Timestamp executionDate;

    @Column(name = "FROM_DATE")
	@JsonProperty("FROM_DATE")
    private Timestamp fromDate;

    @Column(name = "TO_DATE")
	@JsonProperty("TO_DATE")
    private Timestamp toDate;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "TEMPORARY_INVOICE_ID")
	@JsonProperty("TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    
}