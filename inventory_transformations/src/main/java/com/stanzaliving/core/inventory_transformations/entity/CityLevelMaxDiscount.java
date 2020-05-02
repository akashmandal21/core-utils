package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CITY_LEVEL_MAX_DISCOUNT")
public class CityLevelMaxDiscount implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_LEVEL_MAX_DISCOUNT_ID", insertable = false, nullable = false)
    private Integer cityLevelMaxDiscountId;

    @Column(name = "MAX_DISCOUNT_ALLOWED")
    private Double maxDiscountAllowed;

    @Column(name = "CITY_ID")
    private Integer cityId;

    
}