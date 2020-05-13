//package com.stanzaliving.core.inventory_transformations.entity;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.io.Serializable;
//import java.sql.Timestamp;
//
////@Entity
//@Data
//@Table(name = "INVOICE_AUDIT")
//public class InvoiceAuditEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Column(name = "AMOUNT_DUE")
//	@JsonProperty("AMOUNT_DUE")
//    private Double amountDue;
//
//    @Column(name = "AMOUNT_PAID")
//	@JsonProperty("AMOUNT_PAID")
//    private Double amountPaid;
//
//    @Column(name = "DATE_CREATED", nullable = false)
//	@JsonProperty("DATE_CREATED")
//    private Timestamp dateCreated;
//
//    @Column(name = "DUE_DATE", nullable = false)
//	@JsonProperty("DUE_DATE")
//    private Timestamp dueDate;
//
//    @Column(name = "INVOICE_AMOUNT")
//	@JsonProperty("INVOICE_AMOUNT")
//    private Double invoiceAmount;
//
//    @Column(name = "INVOICE_TYPE")
//	@JsonProperty("INVOICE_TYPE")
//    private Integer invoiceType;
//
//    @Column(name = "STATUS")
//	@JsonProperty("STATUS")
//    private String STATUS;
//
//    @Column(name = "STUDENT_ID")
//	@JsonProperty("STUDENT_ID")
//    private String studentId;
//
//    @Column(name = "STANZA_INVOICE_ID")
//	@JsonProperty("STANZA_INVOICE_ID")
//    private String stanzaInvoiceId;
//
//    @Column(name = "FROM_DATE")
//	@JsonProperty("FROM_DATE")
//    private Timestamp fromDate;
//
//    @Column(name = "TO_DATE")
//	@JsonProperty("TO_DATE")
//    private Timestamp toDate;
//
//    @Column(name = "HSN_SAC")
//	@JsonProperty("HSN_SAC")
//    private String hsnSac;
//
//    @Column(name = "DATE_PAID")
//	@JsonProperty("DATE_PAID")
//    private Timestamp datePaid;
//
//    @Column(name = "INVOICE_ID")
//	@JsonProperty("INVOICE_ID")
//    private Integer invoiceId;
//
//    @Column(name = "ADDED_DATE")
//	@JsonProperty("ADDED_DATE")
//    private Timestamp addedDate;
//
//
//}