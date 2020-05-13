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
	@JsonProperty("expected_realisation_id")
    private Integer expectedRealisationId;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("execution_date")
    private Timestamp executionDate;

    @Column(name = "FROM_DATE")
	@JsonProperty("from_date")
    private Timestamp fromDate;

    @Column(name = "TO_DATE")
	@JsonProperty("to_date")
    private Timestamp toDate;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "TEMPORARY_INVOICE_ID")
	@JsonProperty("temporary_invoice_id")
    private Integer temporaryInvoiceId;

    
}