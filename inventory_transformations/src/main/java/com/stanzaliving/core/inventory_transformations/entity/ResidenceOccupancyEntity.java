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
	@JsonProperty("RESIDENCE_OCCUPANCY_ID")
    private Integer residenceOccupancyId;

    @Column(name = "BASE_PRICE", nullable = false)
	@JsonProperty("BASE_PRICE")
    private Integer basePrice;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "OCCUPANCY_ID")
	@JsonProperty("OCCUPANCY_ID")
    private Integer occupancyId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "MANDATORY_SERVICE_PRICE", nullable = false)
	@JsonProperty("MANDATORY_SERVICE_PRICE")
    private Integer mandatoryServicePrice;

    
}