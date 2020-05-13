package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "STUDENT_LEDGER")
@Data
public class StudentLedgerEntity implements Serializable {
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

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}