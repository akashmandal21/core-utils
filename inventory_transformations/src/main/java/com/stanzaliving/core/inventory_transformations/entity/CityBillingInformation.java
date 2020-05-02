package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "CITY_BILLING_INFORMATION")
@Data
@Entity
public class CityBillingInformation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_BILLING_INFORMATION_ID", insertable = false, nullable = false)
    private Integer cityBillingInformationId;

    @Column(name = "CIN")
    private String CIN;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "GST")
    private String GST;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "PAN")
    private String PAN;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "CITY_BILLING_INFORMATION_ADDRESS_ID")
    private Integer cityBillingInformationAddressId;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "REGISTERED_ADDRESS")
    private String registeredAddress;

    
}