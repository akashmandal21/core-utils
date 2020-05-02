package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "CREDIT_NOTE")
@Data
public class CreditNote implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CREDIT_NOTE_ID")
    private String creditNoteId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "ISSUE_DATE")
    private LocalDateTime issueDate;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "STUDENT")
    private String STUDENT;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "EXECUTION_DATE")
    private LocalDateTime executionDate;

    @Column(name = "PURPOSE_ID")
    private Integer purposeId;

    @Column(name = "COMMENT")
    private String COMMENT;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "STANZA_INVOICE_ID")
    private String stanzaInvoiceId;

    @Column(name = "IMPACT_TYPE")
    private Integer impactType = 0;

    @Column(name = "VENDOR")
    private String VENDOR;

    @Column(name = "REMARK")
    private String REMARK;

    
}