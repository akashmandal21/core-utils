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
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
	@JsonProperty("latitude")
    private Double LATITUDE = 0D;

    @Column(name = "LOCALITY")
	@JsonProperty("locality")
    private String LOCALITY;

    @Column(name = "LONGITUDE")
	@JsonProperty("longitude")
    private Double LONGITUDE = 0D;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "REGION_ID")
	@JsonProperty("region_id")
    private Integer regionId;

    
}