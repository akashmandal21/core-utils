package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RESIDENCE_HSC_CODES")
public class ResidenceHscCodes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Id
    @Column(insertable = false, name = "PROPERTY_TYPE", nullable = false)
    private String propertyType;

    @Column(name = "HSC_RENTAL")
    private String hscRental;

    @Column(name = "HSC_SERVICES")
    private String hscServices;

    
}