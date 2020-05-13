package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "STANZA_CITY")
@Entity
public class StanzaCityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "STANZA_CITY_ID", nullable = false)
	@JsonProperty("stanza_city_id")
    private Integer stanzaCityId;

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

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "CODE")
	@JsonProperty("code")
    private String CODE;

    
}