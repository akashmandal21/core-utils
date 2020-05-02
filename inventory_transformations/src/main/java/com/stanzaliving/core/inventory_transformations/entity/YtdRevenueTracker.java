package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "YTD_REVENUE_TRACKER")
@Data
@Entity
public class YtdRevenueTracker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "RESIDENCE_NAME")
    private String residenceName;

    @Column(name = "REVENUE")
    private Double REVENUE;

    @Column(name = "REVENUE_DATE")
    private LocalDate revenueDate;

    @Column(name = "PROPERTY_CATEGORY")
    private Integer propertyCategory;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME")
    private String micromarketName;

    @Column(name = "BOOKING_TYPE")
    private Integer bookingType;

    
}