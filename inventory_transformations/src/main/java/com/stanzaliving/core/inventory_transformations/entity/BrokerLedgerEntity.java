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
	@JsonProperty("ledger_id")
    private Integer ledgerId;

    @Column(name = "BALANCE")
	@JsonProperty("balance")
    private Double BALANCE;

    @Column(name = "CREDIT")
	@JsonProperty("credit")
    private Double CREDIT;

    @Column(name = "DEBIT")
	@JsonProperty("debit")
    private Double DEBIT;

    @Column(name = "BROKER_ID")
	@JsonProperty("broker_id")
    private String brokerId;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "PAYOUT_TYPE")
	@JsonProperty("payout_type")
    private Integer payoutType;

    @Column(name = "BROKER_LEAD_TRANSACTION_ID")
	@JsonProperty("broker_lead_transaction_id")
    private Integer brokerLeadTransactionId;

    @Column(name = "PAYOUT_DATE")
	@JsonProperty("payout_date")
    private Timestamp payoutDate;

    
}