package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "DASHBOARD_CITIES")
@Data
@Entity
public class DashboardCitiesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "CITY_ID", nullable = false)
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    
}