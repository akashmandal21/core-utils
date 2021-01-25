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
	@JsonProperty("ADDRESS_ID")
    private Integer addressId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LANDMARK")
	@JsonProperty("LANDMARK")
    private String LANDMARK;

    @Column(name = "LATITUDE")
	@JsonProperty("LATITUDE")
    private Double LATITUDE;

    @Column(name = "LINE_1", nullable = false)
	@JsonProperty("LINE_1")
    private String line1;

    @Column(name = "LINE_2", nullable = false)
	@JsonProperty("LINE_2")
    private String line2;

    @Column(name = "LONGITUDE")
	@JsonProperty("LONGITUDE")
    private Double LONGITUDE;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "ZIPCODE", nullable = false)
	@JsonProperty("ZIPCODE")
    private Integer ZIPCODE;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "STATE_ID")
	@JsonProperty("STATE_ID")
    private Integer stateId;

    
}