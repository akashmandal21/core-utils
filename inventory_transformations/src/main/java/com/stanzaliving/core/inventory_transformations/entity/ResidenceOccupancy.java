package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RESIDENCE_OCCUPANCY")
public class ResidenceOccupancy implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_OCCUPANCY_ID", insertable = false, nullable = false)
    private Integer residenceOccupancyId;

    @Column(name = "BASE_PRICE", nullable = false)
    private Integer basePrice;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "OCCUPANCY_ID")
    private Integer occupancyId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "MANDATORY_SERVICE_PRICE", nullable = false)
    private Integer mandatoryServicePrice;

    
}