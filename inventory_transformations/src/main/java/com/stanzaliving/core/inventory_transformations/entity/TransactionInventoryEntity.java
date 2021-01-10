package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "TRANSACTION_INVENTORY")
@Entity
@Data
public class TransactionInventoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_INVENTORY_ID", insertable = false, nullable = false)
	@JsonProperty("TRANSACTION_INVENTORY_ID")
    private Integer transactionInventoryId;

    @Column(name = "TRANSACTION_ID", nullable = false)
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "I_SURE_PAY_URL", nullable = false)
	@JsonProperty("I_SURE_PAY_URL")
    private String iSurePayUrl;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    
}