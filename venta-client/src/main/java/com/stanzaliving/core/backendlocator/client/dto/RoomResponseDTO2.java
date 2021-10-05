package com.stanzaliving.core.backendlocator.client.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class RoomResponseDTO2 implements Comparable<RoomResponseDTO2> {

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
	@Builder.Default
	private int beds = 0;

	private RoomPricingResponseDTO roomPricing;

	private boolean dead;

	private boolean convertible;

	private boolean blocked;
	@Builder.Default
	private List<AttributeResponseDTO> attributes = new ArrayList<AttributeResponseDTO>();

	private List<InventoryResponseDTO> inventories;

	private boolean enabled;

	private Date availableFrom;

	private List<FutureRoomPricingDTO> futureRoomPricing;

	private double freeBeds;
	@Builder.Default
	private Boolean isEditable = Boolean.TRUE;

	@Override
	public int compareTo(RoomResponseDTO2 newObj) {
		Double price = this.getRoomPricing().getRoomPrice() + this.getRoomPricing().getMandatoryServicesPrice()
				+ this.getRoomPricing().getFoodServicePrice();
		Double newPrice = newObj.getRoomPricing().getRoomPrice() + newObj.getRoomPricing().getMandatoryServicesPrice()
				+ newObj.getRoomPricing().getFoodServicePrice();
		return price.compareTo(newPrice);
	}
}
