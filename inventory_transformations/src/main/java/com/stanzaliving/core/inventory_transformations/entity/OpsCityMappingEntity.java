package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity
@Data
@Table(name = "OPS_CITY_MAPPING")
public class OpsCityMappingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "VENTA_CITY_ID")
	@JsonProperty("VENTA_CITY_ID")
    private Integer ventaCityId;

    @Column(name = "OPS_CITY_ID")
	@JsonProperty("OPS_CITY_ID")
    private String opsCityId;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    
}