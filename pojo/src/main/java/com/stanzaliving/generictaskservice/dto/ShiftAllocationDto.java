package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vikas S T
 * @date 27-Jul-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class ShiftAllocationDto {

	private String uuid;

	@NotBlank(message = "ShiftId is mandatory")
	private String shiftUuid;

	private String slotUuid;

	private String day;

	private String taskTemplateUuid;

	private LocalTime startingTime;

	private LocalTime endingTime;

	private String createdBy;

	private Date createdDate;
}
