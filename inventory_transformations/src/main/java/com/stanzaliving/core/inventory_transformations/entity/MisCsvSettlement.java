package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "MIS_CSV_SETTLEMENT")
public class MisCsvSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
    private Integer transactionId;

    @Column(name = "VALUE_DATE")
    private LocalDate valueDate;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "CR_DR")
    private String crDr;

    @Column(name = "TRANSACTION_POSTED_DATE")
    private LocalDate transactionPostedDate;

    @Column(name = "AVAILABLE_AMOUNT")
    private Double availableAmount;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "SETTLEMENT_ID")
    private String settlementId;

    
}