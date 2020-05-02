package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "CREDITCARD_TRANSACTION")
public class CreditcardTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "CC_TRANSACTION_ID", nullable = false)
    private Integer ccTransactionId;

    @Column(name = "TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "REQUEST", nullable = false)
    private String REQUEST;

    @Column(name = "BILL_NUMBER", nullable = false)
    private String billNumber;

    
}