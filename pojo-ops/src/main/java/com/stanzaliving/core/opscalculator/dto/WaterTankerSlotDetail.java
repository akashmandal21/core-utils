/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class WaterTankerSlotDetail {

	private LocalDate startDate;
	private LocalDate endDate;
	private int cost;
	private int capacity;
	private int dependency;

}
