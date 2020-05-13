package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ADDRESSS")
public class AddresssEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ADDRESS_ID", nullable = false)
	@JsonProperty("address_id")
    private Integer addressId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LANDMARK")
	@JsonProperty("landmark")
    private String LANDMARK;

    @Column(name = "LATITUDE")
	@JsonProperty("latitude")
    private Double LATITUDE;

    @Column(name = "LINE_1", nullable = false)
	@JsonProperty("line_1")
    private String line1;

    @Column(name = "LINE_2", nullable = false)
	@JsonProperty("line_2")
    private String line2;

    @Column(name = "LONGITUDE")
	@JsonProperty("longitude")
    private Double LONGITUDE;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "ZIPCODE", nullable = false)
	@JsonProperty("zipcode")
    private Integer ZIPCODE;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "STATE_ID")
	@JsonProperty("state_id")
    private Integer stateId;

    
}