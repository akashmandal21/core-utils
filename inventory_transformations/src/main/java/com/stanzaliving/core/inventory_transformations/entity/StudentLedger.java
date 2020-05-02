package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "STUDENT_LEDGER")
public class StudentLedger implements Serializable {
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

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}