package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DASHBOARD_CITIES")
@Data
public class DashboardCities implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Column(name = "NAME")
    private String NAME;

    
}