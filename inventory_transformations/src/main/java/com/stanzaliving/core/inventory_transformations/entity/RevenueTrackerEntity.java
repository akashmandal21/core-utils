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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("property_category")
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
	@JsonProperty("residence_name")
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
	@JsonProperty("micromarket_name")
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
	@JsonProperty("city_name")
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
	@JsonProperty("state_id")
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
	@JsonProperty("state_name")
    private String stateName;

    @Column(name = "ZONE_ID")
	@JsonProperty("zone_id")
    private Integer zoneId = 0;

    @Column(name = "GROSS_REVENUE_AVAILABLE")
	@JsonProperty("gross_revenue_available")
    private Double grossRevenueAvailable = 0D;

    @Column(name = "GROSS_REVENUES_LIVE")
	@JsonProperty("gross_revenues_live")
    private Double grossRevenuesLive = 0D;

    @Column(name = "GROSS_REVENUES_REALISED")
	@JsonProperty("gross_revenues_realised")
    private Double grossRevenuesRealised = 0D;

    @Column(name = "RECURRING_REVENUES_CF")
	@JsonProperty("recurring_revenues_cf")
    private Double recurringRevenuesCf = 0D;

    @Column(name = "NEW_BASE_REVENUE")
	@JsonProperty("new_base_revenue")
    private Double newBaseRevenue = 0D;

    @Column(name = "UPSELL_DOWNSELL_REVENUE")
	@JsonProperty("upsell_downsell_revenue")
    private Double upsellDownsellRevenue = 0D;

    @Column(name = "REVENUES_LOST_ON_CED", nullable = false)
	@JsonProperty("revenues_lost_on_ced")
    private Double revenuesLostOnCed = 0D;

    @Column(name = "REVENUES_LOST_ON_FORFEITURES")
	@JsonProperty("revenues_lost_on_forfeitures")
    private Double revenuesLostOnForfeitures = 0D;

    @Column(name = "ANCILLARY_REVENUES")
	@JsonProperty("ancillary_revenues")
    private Double ancillaryRevenues = 0D;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Date CREATED;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("booking_type")
    private Integer bookingType;

    @Column(name = "CREDIT_NOTE_ADJUSTED")
	@JsonProperty("credit_note_adjusted")
    private Double creditNoteAdjusted;

    @Column(name = "RISK_REVENUE_SD_ADJUSTMENT")
	@JsonProperty("risk_revenue_sd_adjustment")
    private Double riskRevenueSdAdjustment;

    @Column(name = "RISK_REVENUE_CED")
	@JsonProperty("risk_revenue_ced")
    private Double riskRevenueCed;

    @Column(name = "RISK_REVENUE_FORFEITURE")
	@JsonProperty("risk_revenue_forfeiture")
    private Double riskRevenueForfeiture;

    @Column(name = "NEXT_PERIOD_REVENUE")
	@JsonProperty("next_period_revenue")
    private Double nextPeriodRevenue;

    @Column(name = "NEXT_PERIOD_UPSELL_REVENUE")
	@JsonProperty("next_period_upsell_revenue")
    private Double nextPeriodUpsellRevenue;

    @Column(name = "NEXT_PERIOD_ANCILLARY_REVENUE")
	@JsonProperty("next_period_ancillary_revenue")
    private Double nextPeriodAncillaryRevenue;

    @Column(name = "NEXT_PERIOD_EXPECTED_REVENUE")
	@JsonProperty("next_period_expected_revenue")
    private Double nextPeriodExpectedRevenue;

    
}