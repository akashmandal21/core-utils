package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "ADDRESSS")
@Data
@Entity
public class ADDRESSS implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ADDRESS_ID", nullable = false)
    private Integer addressId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LANDMARK")
    private String LANDMARK;

    @Column(name = "LATITUDE")
    private Double LATITUDE;

    @Column(name = "LINE_1", nullable = false)
    private String line1;

    @Column(name = "LINE_2", nullable = false)
    private String line2;

    @Column(name = "LONGITUDE")
    private Double LONGITUDE;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "ZIPCODE", nullable = false)
    private Integer ZIPCODE;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "STATE_ID")
    private Integer stateId;

    
}