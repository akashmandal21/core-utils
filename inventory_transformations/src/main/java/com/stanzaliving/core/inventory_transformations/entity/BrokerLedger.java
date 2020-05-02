package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "BROKER_LEDGER")
public class BrokerLedger implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "LEDGER_ID", nullable = false)
    private Integer ledgerId;

    @Column(name = "BALANCE")
    private Double BALANCE;

    @Column(name = "CREDIT")
    private Double CREDIT;

    @Column(name = "DEBIT")
    private Double DEBIT;

    @Column(name = "BROKER_ID")
    private String brokerId;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "PAYOUT_TYPE")
    private Integer payoutType;

    @Column(name = "BROKER_LEAD_TRANSACTION_ID")
    private Integer brokerLeadTransactionId;

    @Column(name = "PAYOUT_DATE")
    private LocalDateTime payoutDate;

    
}