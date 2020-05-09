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

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}