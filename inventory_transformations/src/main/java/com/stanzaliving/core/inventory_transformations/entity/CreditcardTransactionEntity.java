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
	@JsonProperty("cc_transaction_id")
    private Integer ccTransactionId;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "REQUEST", nullable = false, columnDefinition = "text")
	@JsonProperty("request")
    private String REQUEST;

    @Column(name = "BILL_NUMBER", nullable = false)
	@JsonProperty("bill_number")
    private String billNumber;

    
}