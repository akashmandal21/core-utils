package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "INVOICE_TRANSACTION")
@Data
@Entity
public class InvoiceTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "INVOICE_TRANSACTION_ID", nullable = false)
	@JsonProperty("invoice_transaction_id")
    private Integer invoiceTransactionId;

    @Column(name = "AMOUNT_DUE")
	@JsonProperty("amount_due")
    private Double amountDue;

    @Column(name = "INVOICE_ID")
	@JsonProperty("invoice_id")
    private Integer invoiceId;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private Integer transactionId;

    
}