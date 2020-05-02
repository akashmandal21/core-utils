package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "ACTUAL_REALISATION")
@Data
@Entity
public class ActualRealisation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "EXPECTED_REALISATION_ID", nullable = false)
    private Integer expectedRealisationId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTUAL_REALISATION_ID", insertable = false, nullable = false)
    private Integer actualRealisationId;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "TO_DATE")
    private LocalDateTime toDate;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "INVOICE_ID")
    private String invoiceId;

    
}