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
	@JsonProperty("MERCHANT_TRANSACTION_ID")
    private String merchantTransactionId;

    @Column(name = "ADDED_ON")
	@JsonProperty("ADDED_ON")
    private Timestamp addedOn;

    @Column(name = "FIELD4")
	@JsonProperty("FIELD4")
    private String FIELD4;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("PAYMENT_ID")
    private String paymentId;

    
}