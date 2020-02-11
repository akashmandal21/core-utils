package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdherenceDto {

	private int menuAdherence;

	private int quantityAdherence;

	private int onTimeDelivery;

	private int orderedOnTime;

	private int menuCreatedOnTime;

	private int menuCreatedTimes;

	private int foodOrderedTimes;

	private int foodReceivedTimes;

	private int quantityReceivedTimes;
}