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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "RESIDENCE_NAME")
	@JsonProperty("residence_name")
    private String residenceName;

    @Column(name = "REVENUE")
	@JsonProperty("revenue")
    private Double REVENUE;

    @Column(name = "REVENUE_DATE")
	@JsonProperty("revenue_date")
    private Date revenueDate;

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("property_category")
    private Integer propertyCategory;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "CITY_NAME")
	@JsonProperty("city_name")
    private String cityName;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME")
	@JsonProperty("micromarket_name")
    private String micromarketName;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("booking_type")
    private Integer bookingType;

    
}