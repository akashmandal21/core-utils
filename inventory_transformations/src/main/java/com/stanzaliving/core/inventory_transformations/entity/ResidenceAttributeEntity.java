package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "RESIDENCE_ATTRIBUTE")
@Entity
public class ResidenceAttributeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_ATTRIBUTE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ATTRIBUTE_ID")
    private Integer residenceAttributeId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("PRICE")
    private Integer PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
	@JsonProperty("PRICE_TYPE")
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "ATTRIBUTE_ID")
	@JsonProperty("ATTRIBUTE_ID")
    private Integer attributeId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    
}