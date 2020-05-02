package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "INVOICE_PAYMENT_MODE")
@Data
public class InvoicePaymentMode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "INVOICE_ID", nullable = false)
    private Integer invoiceId;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    
}