package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "PAYU_RAW")
@Data
@Entity
public class PayuRaw implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MERCHANT_TRANSACTION_ID", insertable = false, nullable = false)
    private String merchantTransactionId;

    @Column(name = "ADDED_ON")
    private LocalDateTime addedOn;

    @Column(name = "FIELD4")
    private String FIELD4;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "PAYMENT_ID")
    private String paymentId;

    
}