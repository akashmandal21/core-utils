package com.stanzaliving.housekeepingservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.ShiftDto;
import com.stanzaliving.generictaskservice.dto.SlotDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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

	@NotBlank(message = "SlotUuid is mandatory")
	private String slotUuid;

	@NotBlank(message = "ShiftDate is mandatory")
	private LocalDate shiftDate;

	@NotNull(message = "StartingTime is mandatory")
	private LocalTime startingTime;

	@NotNull(message = "EndingTime is mandatory")
	private LocalTime endingTime;

	private SlotDto slotDto;

	private ShiftDto shiftDto;

}
