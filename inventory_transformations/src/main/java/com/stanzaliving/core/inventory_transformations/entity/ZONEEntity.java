package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ZONE")
public class ZoneEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ZONE_ID", insertable = false, nullable = false)
	@JsonProperty("zone_id")
    private Integer zoneId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
	@JsonProperty("latitude")
    private Double LATITUDE;

    @Column(name = "LONGITUDE")
	@JsonProperty("longitude")
    private Double LONGITUDE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("country_id")
    private Integer countryId;

    @Column(name = "CODE")
	@JsonProperty("code")
    private String CODE;

    
}