package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "CREDITCARD_TRANSACTION")
@Entity
@Data
public class CreditcardTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "CC_TRANSACTION_ID", nullable = false)
	@JsonProperty("CC_TRANSACTION_ID")
    private Integer ccTransactionId;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "REQUEST", nullable = false, columnDefinition = "text")
	@JsonProperty("REQUEST")
    private String REQUEST;

    @Column(name = "BILL_NUMBER", nullable = false)
	@JsonProperty("BILL_NUMBER")
    private String billNumber;

    
}