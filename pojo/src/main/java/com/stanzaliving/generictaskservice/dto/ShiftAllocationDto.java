package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
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
public class ShiftAllocationDto extends AbstractDto {

	@NotBlank(message = "ShiftId is mandatory")
	private String shiftUuid;

	@NotBlank(message = "SlotUuid is mandatory")
	private String slotUuid;

	@NotBlank(message = "ShiftDate is mandatory")
	private LocalDate shiftDate;

	@NotBlank(message = "TaskTemplateUuid is mandatory")
	private String taskTemplateUuid;

	@NotBlank(message = "StartingTime is mandatory")
	private LocalTime startingTime;

	@NotBlank(message = "EndingTime is mandatory")
	private LocalTime endingTime;
}
