package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 9/2/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkBeatPlanRequestDto {
	@NotBlank(message = "Planning template id is mandatory")
	private String planningTemplateId;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;

	private boolean isDraft;

	private boolean callBack;

	private List<HkBeatPersonRequestDto> hkPersons;
}
