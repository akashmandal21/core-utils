package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "CITY_LEVEL_MAX_DISCOUNT")
public class CityLevelMaxDiscountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_LEVEL_MAX_DISCOUNT_ID", insertable = false, nullable = false)
	@JsonProperty("CITY_LEVEL_MAX_DISCOUNT_ID")
    private Integer cityLevelMaxDiscountId;

    @Column(name = "MAX_DISCOUNT_ALLOWED")
	@JsonProperty("MAX_DISCOUNT_ALLOWED")
    private Double maxDiscountAllowed;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    
}