package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "BROKER_LEDGER")
@Entity
@Data
public class BrokerLedgerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "LEDGER_ID", nullable = false)
	@JsonProperty("LEDGER_ID")
    private Integer ledgerId;

    @Column(name = "BALANCE")
	@JsonProperty("BALANCE")
    private Double BALANCE;

    @Column(name = "CREDIT")
	@JsonProperty("CREDIT")
    private Double CREDIT;

    @Column(name = "DEBIT")
	@JsonProperty("DEBIT")
    private Double DEBIT;

    @Column(name = "BROKER_ID")
	@JsonProperty("BROKER_ID")
    private String brokerId;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "PAYOUT_TYPE")
	@JsonProperty("PAYOUT_TYPE")
    private Integer payoutType;

    @Column(name = "BROKER_LEAD_TRANSACTION_ID")
	@JsonProperty("BROKER_LEAD_TRANSACTION_ID")
    private Integer brokerLeadTransactionId;

    @Column(name = "PAYOUT_DATE")
	@JsonProperty("PAYOUT_DATE")
    private Timestamp payoutDate;

    
}