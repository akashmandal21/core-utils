package com.stanzaliving.housekeepingservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import com.stanzaliving.housekeepingservice.enums.HKPlanningTemplateStatus;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/10/2021
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkPlaningTemplatesDto {

	private String uuid;

	@NotBlank(message = "Template name is mandatory")
	private String templateName;

	private HKPlanningTemplateStatus templateStatus;

	@NotBlank(message = "Micro cluster uuid is mandatory")
	private String microClusterUuid;

	@NotEmpty(message = "Entities uuid is mandatory")
	private List<String> applicableEntities = new ArrayList<>();

	private List<String> tags = new ArrayList<>();

	private List<TagResponseDto> tagResponse = new ArrayList<>();

	private List<String> shiftAllocationUuid = new ArrayList<>();

	private List<ShiftAllocationDto> shiftAllocationDtoList = new ArrayList<>();

}