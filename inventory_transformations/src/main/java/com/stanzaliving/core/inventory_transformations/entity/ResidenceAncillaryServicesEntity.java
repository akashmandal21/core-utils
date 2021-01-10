package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "RESIDENCE_ANCILLARY_SERVICES")
@IdClass(ResidenceAncillaryServicesEntity.class)
public class ResidenceAncillaryServicesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Id
    @Column(name = "ANCILLARY_SERVICES_ID", insertable = false, nullable = false)
	@JsonProperty("ANCILLARY_SERVICES_ID")
    private Integer ancillaryServicesId;

    
}