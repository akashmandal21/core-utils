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
	@JsonProperty("residence_service_id")
    private Integer residenceServiceId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "OPTIONAL", nullable = false)
	@JsonProperty("optional")
    private Boolean OPTIONAL;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("price")
    private Double PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
	@JsonProperty("price_type")
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "SERVICE_ID")
	@JsonProperty("service_id")
    private Integer serviceId;

    
}