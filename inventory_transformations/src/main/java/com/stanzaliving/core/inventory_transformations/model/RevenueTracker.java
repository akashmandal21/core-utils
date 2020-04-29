package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "REVENUE_TRACKER")
public class RevenueTracker {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public Integer id;

	@Column(name = "RESIDENCE_ID")
	public Integer residenceId;

	@Column(name = "PROPERTY_CATEGORY")
	public Integer propertyCategory;

	@Column(name = "RESIDENCE_NAME")
	public String residenceName;

	@Column(name = "MICROMARKET_ID")
	public Integer micromarketID;

	@Column(name = "MICROMARKET_NAME")
	public String micromarketName;

	@Column(name = "CITY_ID")
	public Integer cityId;

	@Column(name = "CITY_NAME")
	public String cityName;

	@Column(name = "STATE_ID")
	public Integer stateId;

	@Column(name = "STATE_NAME")
	public String stateName;

	@Column(name = "GROSS_REVENUE_AVAILABLE")
	public Double grossRevenueAvailable;

	@Column(name = "GROSS_REVENUES_LIVE")
	public Double grossRevenueLive;

	@Column(name = "GROSS_REVENUES_REALISED")
	public Double grossRevenueRealised;

	@Column(name = "RECURRING_REVENUES_CF")
	public Double recurringRevenueCarryForwarded;

	@Column(name = "NEW_BASE_REVENUE")
	public Double newBaseRevenue;

	@Column(name = "UPSELL_DOWNSELL_REVENUE")
	public Double upsellDownsellRevenue;

	@Column(name = "REVENUES_LOST_ON_CED")
	public Double revenueLostOnCed;

	@Column(name = "REVENUES_LOST_ON_FORFEITURES")
	public Double revenueLostOnForfeitures;

	@Column(name = "ANCILLARY_REVENUES")
	public Double ancillaryRevenue;

	@Column(name = "CREATED")
	public Date created = new Date();
		
}
