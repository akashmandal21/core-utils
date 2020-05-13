package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "CITY")
@Data
@Entity
public class CityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "CITY_ID", nullable = false)
	@JsonProperty("city_id")
    private Integer cityId;

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

    @Column(name = "STATE_ID")
	@JsonProperty("state_id")
    private Integer stateId;

    @Column(name = "CODE")
	@JsonProperty("code")
    private String CODE;

    @Column(name = "BROKER_APP_VISIBLE", nullable = false)
	@JsonProperty("broker_app_visible")
    private Boolean brokerAppVisible;

    
}