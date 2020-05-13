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
	@JsonProperty("city_billing_information_id")
    private Integer cityBillingInformationId;

    @Column(name = "CIN")
	@JsonProperty("cin")
    private String CIN;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "GST")
	@JsonProperty("gst")
    private String GST;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "PAN")
	@JsonProperty("pan")
    private String PAN;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CITY_BILLING_INFORMATION_ADDRESS_ID")
	@JsonProperty("city_billing_information_address_id")
    private Integer cityBillingInformationAddressId;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "REGISTERED_ADDRESS")
	@JsonProperty("registered_address")
    private String registeredAddress;

    
}