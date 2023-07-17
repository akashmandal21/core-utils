package com.stanzaliving.core.backendlocator.client.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RoomResponseDTO {

	private int roomId;

	private String roomNumber;

	private String floor;

	private int residenceId;

	private String residenceName;

	private int initialOccupancyId;

	private int initialOccupancy;

	private String initialOccupancyName;

	private int occupancyId;

	private int occupancy;

	private String occupancyName;

	private int beds;

	private RoomPricingResponseDTO roomPricing;

	private boolean dead;

	private boolean convertible;

	private boolean blocked;
	@Builder.Default
	private Set<AttributeResponseDTO> attributes = new HashSet<>(0);

	private Set<InventoryResponseDTO> inventories;

	private boolean enabled;

	private Integer freeBeds;

	private boolean nonMgBed;
}
