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
@Table(name = "SALES_TRACKER")
public class SalesTracker {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public Integer id;

	@Column(name = "AVAILABLE_BEDS")
	public Double availableBeds;

	@Column(name = "DEAD_BEDS")
	public Double deadBeds;

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

	@Column(name = "ZONE_ID", nullable = true)
	public Integer zoneId;

	@Column(name = "LIVE_BEDS")
	public Double liveBeds;
	
	@Column(name = "AVERAGE_COMMITTED_LOCKIN", nullable = true)
	public Double averageCommittedLockin = 0d;

	@Column(name = "AVERAGE_UNEXPIRED_LOCKIN", nullable = true)
	public Double averageUnExpiredLockin = 0d;
	
	@Column(name = "UNIQUE_SALES")
	public Double uniqueSales;
	
	@Column(name = "UPCOMING_TERMINATIONS")
	public Double upcomingTerminations;
	
	@Column(name = "UPCOMING_MOVE_INS")
	public Double upcomingMoveIns;

	@Column(name = "LIVE_BOOKINGS")
	public double liveBookings = 0.0;

	@Column(name = "RUNNING_FORFEITURE")
	public Double runningForfeiture = 0.0;

	@Column(name = "LIVE_OCCUPANCY")
	public Double liveOccupancy;

	@Column(name = "ONBOARDED_BEDS", nullable = true)
	public double onboardedBeds;

	@Column(name = "FORWARD_GROSS_OCCUPANCY")
	public double fwdGrossOccupancy;

	@Column(name = "FORWARD_NET_OCCUPANCY")
	public double fwdNetOccupancy;

	@Column(name = "INVENTORY_IDS")
	public String inventoryIds;

	@Column(name = "MTD")
	public double mtd;

	@Column(name = "L7D")
	public double l7d;

	@Column(name = "L3D")
	public double l3d;

	@Column(name = "RETENTION_MTD")
	public double rmtd;

	@Column(name = "RETENTION_L7D")
	public double rl7d;

	@Column(name = "RETENTION_L3D")
	public double rl3d;

	@Column(name = "CREATED")
	public Date created = new Date();
		
}
