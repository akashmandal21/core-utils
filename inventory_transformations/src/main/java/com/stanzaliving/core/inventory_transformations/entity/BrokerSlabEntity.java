package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "BROKER_SLAB")
@Data
@Entity
public class BrokerSlabEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "SLAB_NAME", nullable = false)
	@JsonProperty("SLAB_NAME")
    private String slabName;

    @Column(name = "RESTRICTED_VISIBILITY", nullable = false)
	@JsonProperty("RESTRICTED_VISIBILITY")
    private Boolean restrictedVisibility;

    
}