package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "RESIDENCE_SUPPLEMENTARY_DETAILS")
@Data
@Entity
public class ResidenceSupplementaryDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "EXPIRE_DAYS", nullable = false)
    private Integer expireDays;

    
}