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
//	@JsonProperty("amount_due")
//    private Double amountDue;
//
//    @Column(name = "AMOUNT_PAID")
//	@JsonProperty("amount_paid")
//    private Double amountPaid;
//
//    @Column(name = "DATE_CREATED", nullable = false)
//	@JsonProperty("date_created")
//    private Timestamp dateCreated;
//
//    @Column(name = "DUE_DATE", nullable = false)
//	@JsonProperty("due_date")
//    private Timestamp dueDate;
//
//    @Column(name = "INVOICE_AMOUNT")
//	@JsonProperty("invoice_amount")
//    private Double invoiceAmount;
//
//    @Column(name = "INVOICE_TYPE")
//	@JsonProperty("invoice_type")
//    private Integer invoiceType;
//
//    @Column(name = "STATUS")
//	@JsonProperty("status")
//    private String STATUS;
//
//    @Column(name = "STUDENT_ID")
//	@JsonProperty("student_id")
//    private String studentId;
//
//    @Column(name = "STANZA_INVOICE_ID")
//	@JsonProperty("stanza_invoice_id")
//    private String stanzaInvoiceId;
//
//    @Column(name = "FROM_DATE")
//	@JsonProperty("from_date")
//    private Timestamp fromDate;
//
//    @Column(name = "TO_DATE")
//	@JsonProperty("to_date")
//    private Timestamp toDate;
//
//    @Column(name = "HSN_SAC")
//	@JsonProperty("hsn_sac")
//    private String hsnSac;
//
//    @Column(name = "DATE_PAID")
//	@JsonProperty("date_paid")
//    private Timestamp datePaid;
//
//    @Column(name = "INVOICE_ID")
//	@JsonProperty("invoice_id")
//    private Integer invoiceId;
//
//    @Column(name = "ADDED_DATE")
//	@JsonProperty("added_date")
//    private Timestamp addedDate;
//
//
//}