package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "EXCEPTION_DATA")
public class ExceptionDataEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CREATED_DATE", nullable = false)
	@JsonProperty("CREATED_DATE")
    private Timestamp createdDate;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("TRANSACTION_ID")
    private String transactionId;

    @Column(name = "SOURCE")
	@JsonProperty("SOURCE")
    private String SOURCE;

    @Column(name = "MESSAGE", columnDefinition = "text")
	@JsonProperty("MESSAGE")
    private String MESSAGE;

    
}