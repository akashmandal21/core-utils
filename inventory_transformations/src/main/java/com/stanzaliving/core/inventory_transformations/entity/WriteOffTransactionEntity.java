package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "WRITE_OFF_TRANSACTION")
public class WriteOffTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "WRITE_OFF_REASON")
	@JsonProperty("write_off_reason")
    private String writeOffReason;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    
}