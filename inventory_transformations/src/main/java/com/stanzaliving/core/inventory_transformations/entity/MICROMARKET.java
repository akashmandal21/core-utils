package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "MICROMARKET")
@Data
@Entity
public class MICROMARKET implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MICROMARKET_ID", insertable = false, nullable = false)
    private Integer micromarketId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
    private Double LATITUDE = 0D;

    @Column(name = "LOCALITY")
    private String LOCALITY;

    @Column(name = "LONGITUDE")
    private Double LONGITUDE = 0D;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "REGION_ID")
    private Integer regionId;

    
}