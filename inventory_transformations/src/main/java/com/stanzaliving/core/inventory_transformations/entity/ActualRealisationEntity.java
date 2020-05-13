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
	@JsonProperty("expected_realisation_id")
    private Integer expectedRealisationId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTUAL_REALISATION_ID", insertable = false, nullable = false)
	@JsonProperty("actual_realisation_id")
    private Integer actualRealisationId;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "FROM_DATE")
	@JsonProperty("from_date")
    private Timestamp fromDate;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "TO_DATE")
	@JsonProperty("to_date")
    private Timestamp toDate;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "INVOICE_ID")
	@JsonProperty("invoice_id")
    private String invoiceId;

    
}