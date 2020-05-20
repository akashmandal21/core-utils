package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "RESIDENCE_SERVICES")
@Data
@Entity
public class ResidenceServicesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_SERVICE_ID", nullable = false)
	@JsonProperty("RESIDENCE_SERVICE_ID")
    private Integer residenceServiceId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "OPTIONAL", nullable = false)
	@JsonProperty("OPTIONAL")
    private Boolean OPTIONAL;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("PRICE")
    private Double PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
	@JsonProperty("PRICE_TYPE")
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "SERVICE_ID")
	@JsonProperty("SERVICE_ID")
    private Integer serviceId;

    
}