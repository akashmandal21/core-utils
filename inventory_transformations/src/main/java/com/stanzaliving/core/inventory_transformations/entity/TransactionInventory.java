package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TRANSACTION_INVENTORY")
public class TransactionInventory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_INVENTORY_ID", insertable = false, nullable = false)
    private Integer transactionInventoryId;

    @Column(name = "TRANSACTION_ID", nullable = false)
    private Integer transactionId;

    @Column(name = "I_SURE_PAY_URL", nullable = false)
    private String iSurePayUrl;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    
}