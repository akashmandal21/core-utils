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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "REVENUE_LOST_ON_FORFEITURES")
	@JsonProperty("revenue_lost_on_forfeitures")
    private Double revenueLostOnForfeitures;

    @Column(name = "ANCILLARY_REVENUE")
	@JsonProperty("ancillary_revenue")
    private Double ancillaryRevenue;

    @Column(name = "REVENUE_LOST_ON_CED")
	@JsonProperty("revenue_lost_on_ced")
    private Double revenueLostOnCed;

    @Column(name = "UPSELL_DOWNSELL_REVENUE")
	@JsonProperty("upsell_downsell_revenue")
    private Double upsellDownsellRevenue;

    @Column(name = "NEW_BASE_REVENUE")
	@JsonProperty("new_base_revenue")
    private Double newBaseRevenue;

    @Column(name = "RECURRING_REVENUE")
	@JsonProperty("recurring_revenue")
    private Double recurringRevenue;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("booking_type")
    private Integer bookingType;

    @Column(name = "REVENUE_DATE")
	@JsonProperty("revenue_date")
    private Date revenueDate;

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("property_category")
    private Integer propertyCategory;

    
}