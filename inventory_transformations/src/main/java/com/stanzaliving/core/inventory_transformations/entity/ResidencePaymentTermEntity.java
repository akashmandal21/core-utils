package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "RESIDENCE_PAYMENT_TERM")
@IdClass(ResidencePaymentTermEntity.class)
public class ResidencePaymentTermEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Id
    @Column(name = "PAYMENT_TERM_ID", insertable = false, nullable = false)
	@JsonProperty("PAYMENT_TERM_ID")
    private Integer paymentTermId;

    
}