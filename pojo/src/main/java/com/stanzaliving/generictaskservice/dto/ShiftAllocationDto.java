package com.stanzaliving.generictaskservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 27-Jul-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ShiftAllocationDto extends AbstractDto {

	@NotBlank(message = "ShiftId is mandatory")
	private String shiftUuid;

	private String slotUuid;

	@NotBlank(message = "Day is mandatory")
	private DayOfWeek shiftDay;

	@NotBlank(message = "StartingTime is mandatory")
	private LocalTime startingTime;

	@NotBlank(message = "EndingTime is mandatory")
	private LocalTime endingTime;

	private SlotDto slotDto;

	private ShiftDto shiftDto;

}
