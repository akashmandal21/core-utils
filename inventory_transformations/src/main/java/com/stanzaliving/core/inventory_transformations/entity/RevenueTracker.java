package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "REVENUE_TRACKER")
public class RevenueTracker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
    private String stateName;

    @Column(name = "ZONE_ID")
    private Integer zoneId = 0;

    @Column(name = "GROSS_REVENUE_AVAILABLE")
    private Double grossRevenueAvailable = 0D;

    @Column(name = "GROSS_REVENUES_LIVE")
    private Double grossRevenuesLive = 0D;

    @Column(name = "GROSS_REVENUES_REALISED")
    private Double grossRevenuesRealised = 0D;

    @Column(name = "RECURRING_REVENUES_CF")
    private Double recurringRevenuesCf = 0D;

    @Column(name = "NEW_BASE_REVENUE")
    private Double newBaseRevenue = 0D;

    @Column(name = "UPSELL_DOWNSELL_REVENUE")
    private Double upsellDownsellRevenue = 0D;

    @Column(name = "REVENUES_LOST_ON_CED", nullable = false)
    private Double revenuesLostOnCed = 0D;

    @Column(name = "REVENUES_LOST_ON_FORFEITURES")
    private Double revenuesLostOnForfeitures = 0D;

    @Column(name = "ANCILLARY_REVENUES")
    private Double ancillaryRevenues = 0D;

    @Column(name = "CREATED", nullable = false)
    private LocalDate CREATED;

    @Column(name = "BOOKING_TYPE")
    private Integer bookingType;

    @Column(name = "CREDIT_NOTE_ADJUSTED")
    private Double creditNoteAdjusted;

    @Column(name = "RISK_REVENUE_SD_ADJUSTMENT")
    private Double riskRevenueSdAdjustment;

    @Column(name = "RISK_REVENUE_CED")
    private Double riskRevenueCed;

    @Column(name = "RISK_REVENUE_FORFEITURE")
    private Double riskRevenueForfeiture;

    @Column(name = "NEXT_PERIOD_REVENUE")
    private Double nextPeriodRevenue;

    @Column(name = "NEXT_PERIOD_UPSELL_REVENUE")
    private Double nextPeriodUpsellRevenue;

    @Column(name = "NEXT_PERIOD_ANCILLARY_REVENUE")
    private Double nextPeriodAncillaryRevenue;

    @Column(name = "NEXT_PERIOD_EXPECTED_REVENUE")
    private Double nextPeriodExpectedRevenue;

    
}