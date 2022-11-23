package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "YTD_REVENUE_TRACKER_copy")
public class YtdRevenueTrackerCopyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "RESIDENCE_NAME")
	@JsonProperty("RESIDENCE_NAME")
    private String residenceName;

    @Column(name = "REVENUE")
	@JsonProperty("REVENUE")
    private Double REVENUE;

    @Column(name = "REVENUE_DATE")
	@JsonProperty("REVENUE_DATE")
    private Date revenueDate;

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "CITY_NAME")
	@JsonProperty("CITY_NAME")
    private String cityName;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME")
	@JsonProperty("MICROMARKET_NAME")
    private String micromarketName;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("BOOKING_TYPE")
    private Integer bookingType;

    
}