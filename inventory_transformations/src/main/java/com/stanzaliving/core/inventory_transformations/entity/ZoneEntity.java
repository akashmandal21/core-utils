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
	@JsonProperty("ZONE_ID")
    private Integer zoneId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
	@JsonProperty("LATITUDE")
    private Double LATITUDE;

    @Column(name = "LONGITUDE")
	@JsonProperty("LONGITUDE")
    private Double LONGITUDE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("COUNTRY_ID")
    private Integer countryId;

    @Column(name = "CODE")
	@JsonProperty("CODE")
    private String CODE;

    
}