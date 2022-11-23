package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "ACTUAL_REALISATION")
@Data
@Entity
public class ActualRealisationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "EXPECTED_REALISATION_ID", nullable = false)
	@JsonProperty("EXPECTED_REALISATION_ID")
    private Integer expectedRealisationId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTUAL_REALISATION_ID", insertable = false, nullable = false)
	@JsonProperty("ACTUAL_REALISATION_ID")
    private Integer actualRealisationId;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "FROM_DATE")
	@JsonProperty("FROM_DATE")
    private Timestamp fromDate;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "TO_DATE")
	@JsonProperty("TO_DATE")
    private Timestamp toDate;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "INVOICE_ID")
	@JsonProperty("INVOICE_ID")
    private String invoiceId;

    
}