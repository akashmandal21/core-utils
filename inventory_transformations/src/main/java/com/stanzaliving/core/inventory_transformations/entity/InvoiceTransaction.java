package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVOICE_TRANSACTION")
@Data
public class InvoiceTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "INVOICE_TRANSACTION_ID", nullable = false)
    private Integer invoiceTransactionId;

    @Column(name = "AMOUNT_DUE")
    private Double amountDue;

    @Column(name = "INVOICE_ID")
    private Integer invoiceId;

    @Column(name = "TRANSACTION_ID")
    private Integer transactionId;

    
}