package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PAYMENT_TERM")
public class PaymentTerm implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_TERM_ID", insertable = false, nullable = false)
    private Integer paymentTermId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "INSTALLMENTS", nullable = false)
    private Integer INSTALLMENTS;

    @Column(name = "IS_MONTHLY")
    private Boolean monthly;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}