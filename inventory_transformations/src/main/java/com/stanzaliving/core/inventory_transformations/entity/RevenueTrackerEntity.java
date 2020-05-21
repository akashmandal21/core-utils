package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "REVENUE_TRACKER")
@Data
public class RevenueTrackerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
	@JsonProperty("RESIDENCE_NAME")
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
	@JsonProperty("MICROMARKET_NAME")
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
	@JsonProperty("CITY_NAME")
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
	@JsonProperty("STATE_ID")
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
	@JsonProperty("STATE_NAME")
    private String stateName;

    @Column(name = "ZONE_ID")
	@JsonProperty("ZONE_ID")
    private Integer zoneId = 0;

//    @Column(name = "GROSS_REVENUE_AVAILABLE")
//	@JsonProperty("GROSS_REVENUE_AVAILABLE")
//    private Double grossRevenueAvailable = 0D;
//
//    @Column(name = "GROSS_REVENUES_LIVE")
//	@JsonProperty("GROSS_REVENUES_LIVE")
//    private Double grossRevenuesLive = 0D;
//
//    @Column(name = "GROSS_REVENUES_REALISED")
//	@JsonProperty("GROSS_REVENUES_REALISED")
//    private Double grossRevenuesRealised = 0D;
//
//    @Column(name = "RECURRING_REVENUES_CF")
//	@JsonProperty("RECURRING_REVENUES_CF")
//    private Double recurringRevenuesCf = 0D;
//
//    @Column(name = "NEW_BASE_REVENUE")
//	@JsonProperty("NEW_BASE_REVENUE")
//    private Double newBaseRevenue = 0D;
//
//    @Column(name = "UPSELL_DOWNSELL_REVENUE")
//	@JsonProperty("UPSELL_DOWNSELL_REVENUE")
//    private Double upsellDownsellRevenue = 0D;
//
//    @Column(name = "REVENUES_LOST_ON_CED", nullable = false)
//	@JsonProperty("REVENUES_LOST_ON_CED")
//    private Double revenuesLostOnCed = 0D;
//
//    @Column(name = "REVENUES_LOST_ON_FORFEITURES")
//	@JsonProperty("REVENUES_LOST_ON_FORFEITURES")
//    private Double revenuesLostOnForfeitures = 0D;
//
//    @Column(name = "ANCILLARY_REVENUES")
//	@JsonProperty("ANCILLARY_REVENUES")
//    private Double ancillaryRevenues = 0D;
//
//    @Column(name = "CREATED", nullable = false)
//	@JsonProperty("CREATED")
//    private Date CREATED;
//
//    @Column(name = "BOOKING_TYPE")
//	@JsonProperty("BOOKING_TYPE")
//    private Integer bookingType;
//
//    @Column(name = "CREDIT_NOTE_ADJUSTED")
//	@JsonProperty("CREDIT_NOTE_ADJUSTED")
//    private Double creditNoteAdjusted;
//
//    @Column(name = "RISK_REVENUE_SD_ADJUSTMENT")
//	@JsonProperty("RISK_REVENUE_SD_ADJUSTMENT")
//    private Double riskRevenueSdAdjustment;
//
//    @Column(name = "RISK_REVENUE_CED")
//	@JsonProperty("RISK_REVENUE_CED")
//    private Double riskRevenueCed;
//
//    @Column(name = "RISK_REVENUE_FORFEITURE")
//	@JsonProperty("RISK_REVENUE_FORFEITURE")
//    private Double riskRevenueForfeiture;
//
////    @Column(name = "NEXT_PERIOD_REVENUE")
////	@JsonProperty("NEXT_PERIOD_REVENUE")
////    private Double nextPeriodRevenue;
//
//    @Column(name = "NEXT_PERIOD_UPSELL_REVENUE")
//	@JsonProperty("NEXT_PERIOD_UPSELL_REVENUE")
//    private Double nextPeriodUpsellRevenue;
//
//    @Column(name = "NEXT_PERIOD_ANCILLARY_REVENUE")
//	@JsonProperty("NEXT_PERIOD_ANCILLARY_REVENUE")
//    private Double nextPeriodAncillaryRevenue;
//
//    @Column(name = "NEXT_PERIOD_EXPECTED_REVENUE")
//	@JsonProperty("NEXT_PERIOD_EXPECTED_REVENUE")
//    private Double nextPeriodExpectedRevenue;

    
}