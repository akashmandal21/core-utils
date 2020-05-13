package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CREDIT_NOTE")
public class CreditNoteEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CREDIT_NOTE_ID")
	@JsonProperty("CREDIT_NOTE_ID")
    private String creditNoteId;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "ISSUE_DATE")
	@JsonProperty("ISSUE_DATE")
    private Timestamp issueDate;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "STUDENT")
	@JsonProperty("STUDENT")
    private String STUDENT;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("EXECUTION_DATE")
    private Timestamp executionDate;

    @Column(name = "PURPOSE_ID")
	@JsonProperty("PURPOSE_ID")
    private Integer purposeId;

    @Column(name = "COMMENT")
	@JsonProperty("COMMENT")
    private String COMMENT;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "STANZA_INVOICE_ID")
	@JsonProperty("STANZA_INVOICE_ID")
    private String stanzaInvoiceId;

    @Column(name = "IMPACT_TYPE")
	@JsonProperty("IMPACT_TYPE")
    private Integer impactType = 0;

    @Column(name = "VENDOR")
	@JsonProperty("VENDOR")
    private String VENDOR;

    @Column(name = "REMARK")
	@JsonProperty("REMARK")
    private String REMARK;

    
}