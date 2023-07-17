package com.stanzaliving.core.backendlocator.client.dto;

import java.util.Date;

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
public class InventoryResponseDTO {

	private int inventoryId;
	private boolean occupied;

	private float numberOfBeds;

	private Date endDate;
}
