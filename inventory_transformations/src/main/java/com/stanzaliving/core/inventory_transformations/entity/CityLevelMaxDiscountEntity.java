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
	@JsonProperty("city_level_max_discount_id")
    private Integer cityLevelMaxDiscountId;

    @Column(name = "MAX_DISCOUNT_ALLOWED")
	@JsonProperty("max_discount_allowed")
    private Double maxDiscountAllowed;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    
}