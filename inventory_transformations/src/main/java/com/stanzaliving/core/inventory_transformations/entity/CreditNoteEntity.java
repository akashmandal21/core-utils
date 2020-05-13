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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "CREDIT_NOTE_ID")
	@JsonProperty("credit_note_id")
    private String creditNoteId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "ISSUE_DATE")
	@JsonProperty("issue_date")
    private Timestamp issueDate;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "STUDENT")
	@JsonProperty("student")
    private String STUDENT;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("execution_date")
    private Timestamp executionDate;

    @Column(name = "PURPOSE_ID")
	@JsonProperty("purpose_id")
    private Integer purposeId;

    @Column(name = "COMMENT")
	@JsonProperty("comment")
    private String COMMENT;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "STANZA_INVOICE_ID")
	@JsonProperty("stanza_invoice_id")
    private String stanzaInvoiceId;

    @Column(name = "IMPACT_TYPE")
	@JsonProperty("impact_type")
    private Integer impactType = 0;

    @Column(name = "VENDOR")
	@JsonProperty("vendor")
    private String VENDOR;

    @Column(name = "REMARK")
	@JsonProperty("remark")
    private String REMARK;

    
}