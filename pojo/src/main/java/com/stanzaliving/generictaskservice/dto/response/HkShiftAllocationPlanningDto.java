package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/11/2021
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HkShiftAllocationPlanningDto {
	private String uuid;

	@NotBlank(message = "Template name is mandatory")
	private String templateName;

	private String microclusterUuid;

	private List<String> tags = new ArrayList<>();

	private List<String> shiftAllocationUuids = new ArrayList<>();
}
