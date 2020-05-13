package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "RESIDENCE_OCCUPANCY")
@Entity
@Data
public class ResidenceOccupancyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_OCCUPANCY_ID", insertable = false, nullable = false)
	@JsonProperty("residence_occupancy_id")
    private Integer residenceOccupancyId;

    @Column(name = "BASE_PRICE", nullable = false)
	@JsonProperty("base_price")
    private Integer basePrice;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "OCCUPANCY_ID")
	@JsonProperty("occupancy_id")
    private Integer occupancyId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "MANDATORY_SERVICE_PRICE", nullable = false)
	@JsonProperty("mandatory_service_price")
    private Integer mandatoryServicePrice;

    
}