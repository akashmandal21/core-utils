package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "RESIDENCE_PAYMENT_TERM")
@Data
@Entity
public class ResidencePaymentTerm implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
    private Integer residenceId;

    @Id
    @Column(name = "PAYMENT_TERM_ID", insertable = false, nullable = false)
    private Integer paymentTermId;

    
}