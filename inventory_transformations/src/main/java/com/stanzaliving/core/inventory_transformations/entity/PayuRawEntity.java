package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "PAYU_RAW")
@Entity
public class PayuRawEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MERCHANT_TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;

    @Column(name = "ADDED_ON")
	@JsonProperty("added_on")
    private Timestamp addedOn;

    @Column(name = "FIELD4")
	@JsonProperty("field4")
    private String FIELD4;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("payment_id")
    private String paymentId;

    
}