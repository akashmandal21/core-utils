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
	@JsonProperty("residence_attribute_id")
    private Integer residenceAttributeId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("price")
    private Integer PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
	@JsonProperty("price_type")
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "ATTRIBUTE_ID")
	@JsonProperty("attribute_id")
    private Integer attributeId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    
}