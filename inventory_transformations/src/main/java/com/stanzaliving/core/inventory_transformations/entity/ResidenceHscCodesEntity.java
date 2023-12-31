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
@Entity
@Table(name = "RESIDENCE_HSC_CODES")
public class ResidenceHscCodesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Id
    @Column(insertable = false, name = "PROPERTY_TYPE", nullable = false)
	@JsonProperty("PROPERTY_TYPE")
    private String propertyType;

    @Column(name = "HSC_RENTAL")
	@JsonProperty("HSC_RENTAL")
    private String hscRental;

    @Column(name = "HSC_SERVICES")
	@JsonProperty("HSC_SERVICES")
    private String hscServices;

    
}