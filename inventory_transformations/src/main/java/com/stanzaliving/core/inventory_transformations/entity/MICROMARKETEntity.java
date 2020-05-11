package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "MICROMARKET")
public class MicromarketEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MICROMARKET_ID", insertable = false, nullable = false)
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
	@JsonProperty("LATITUDE")
    private Double LATITUDE = 0D;

    @Column(name = "LOCALITY")
	@JsonProperty("LOCALITY")
    private String LOCALITY;

    @Column(name = "LONGITUDE")
	@JsonProperty("LONGITUDE")
    private Double LONGITUDE = 0D;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "REGION_ID")
	@JsonProperty("REGION_ID")
    private Integer regionId;

    
}