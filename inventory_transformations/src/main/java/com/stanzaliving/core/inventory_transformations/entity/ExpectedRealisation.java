package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "EXPECTED_REALISATION")
@Data
public class ExpectedRealisation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXPECTED_REALISATION_ID", insertable = false, nullable = false)
    private Integer expectedRealisationId;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "EXECUTION_DATE")
    private LocalDateTime executionDate;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "TO_DATE")
    private LocalDateTime toDate;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    
}