package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "WRITE_OFF_TRANSACTION")
@Entity
@Data
public class WriteOffTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "WRITE_OFF_REASON")
    private String writeOffReason;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    
}