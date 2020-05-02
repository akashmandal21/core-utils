package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "EXCEPTION_DATA")
@Data
@Entity
public class ExceptionData implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CREATED_DATE", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "SOURCE")
    private String SOURCE;

    @Column(name = "MESSAGE")
    private String MESSAGE;

    
}