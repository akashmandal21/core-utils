package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "CITY_BILLING_INFORMATION")
@Data
@Entity
public class CityBillingInformationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_BILLING_INFORMATION_ID", insertable = false, nullable = false)
	@JsonProperty("CITY_BILLING_INFORMATION_ID")
    private Integer cityBillingInformationId;

    @Column(name = "CIN")
	@JsonProperty("CIN")
    private String CIN;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "GST")
	@JsonProperty("GST")
    private String GST;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "PAN")
	@JsonProperty("PAN")
    private String PAN;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CITY_BILLING_INFORMATION_ADDRESS_ID")
	@JsonProperty("CITY_BILLING_INFORMATION_ADDRESS_ID")
    private Integer cityBillingInformationAddressId;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "REGISTERED_ADDRESS")
	@JsonProperty("REGISTERED_ADDRESS")
    private String registeredAddress;

    
}