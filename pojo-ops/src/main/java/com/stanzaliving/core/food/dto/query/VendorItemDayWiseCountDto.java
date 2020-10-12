package com.stanzaliving.core.food.dto.query;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 09-Oct-2020
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorItemDayWiseCountDto extends VendorItemCountQueryDto {

	private Integer lastFourWeekSun;

	private Integer lastFourWeekMon;

	private Integer lastFourWeekTue;

	private Integer lastFourWeekWed;

	private Integer lastFourWeekThu;

	private Integer lastFourWeekFri;

	private Integer lastFourWeekSat;
}
