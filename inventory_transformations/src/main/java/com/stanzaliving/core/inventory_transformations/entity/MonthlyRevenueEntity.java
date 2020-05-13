package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Table(name = "MONTHLY_REVENUE")
@Data
@Entity
public class MonthlyRevenueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "REVENUE_LOST_ON_FORFEITURES")
	@JsonProperty("REVENUE_LOST_ON_FORFEITURES")
    private Double revenueLostOnForfeitures;

    @Column(name = "ANCILLARY_REVENUE")
	@JsonProperty("ANCILLARY_REVENUE")
    private Double ancillaryRevenue;

    @Column(name = "REVENUE_LOST_ON_CED")
	@JsonProperty("REVENUE_LOST_ON_CED")
    private Double revenueLostOnCed;

    @Column(name = "UPSELL_DOWNSELL_REVENUE")
	@JsonProperty("UPSELL_DOWNSELL_REVENUE")
    private Double upsellDownsellRevenue;

    @Column(name = "NEW_BASE_REVENUE")
	@JsonProperty("NEW_BASE_REVENUE")
    private Double newBaseRevenue;

    @Column(name = "RECURRING_REVENUE")
	@JsonProperty("RECURRING_REVENUE")
    private Double recurringRevenue;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("BOOKING_TYPE")
    private Integer bookingType;

    @Column(name = "REVENUE_DATE")
	@JsonProperty("REVENUE_DATE")
    private Date revenueDate;

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory;

    
}