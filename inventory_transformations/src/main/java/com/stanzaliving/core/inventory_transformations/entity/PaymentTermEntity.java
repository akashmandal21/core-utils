package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "PAYMENT_TERM")
public class PaymentTermEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_TERM_ID", insertable = false, nullable = false)
	@JsonProperty("PAYMENT_TERM_ID")
    private Integer paymentTermId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "INSTALLMENTS", nullable = false)
	@JsonProperty("INSTALLMENTS")
    private Integer INSTALLMENTS;

    @Column(name = "IS_MONTHLY")
	@JsonProperty("IS_MONTHLY")
    private Boolean monthly;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}