package com.stanzaliving.housekeepingservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.generictaskservice.dto.response.MicroClusterResponseDto;
import com.stanzaliving.generictaskservice.dto.response.ShitAllocationDetailsResponse;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import com.stanzaliving.housekeepingservice.enums.HKPlanningTemplateStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 8/10/2021
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkPlaningTemplatesDto extends AbstractDto {

	@NotBlank(message = "Template name is mandatory")
	private String templateName;

	private HKPlanningTemplateStatus templateStatus;

	@NotBlank(message = "Micro cluster uuid is mandatory")
	private String microClusterUuid;

	@NotEmpty(message = "Entities uuid is mandatory")
	private List<String> applicableEntities = new ArrayList<>();

	private String createByUserName;

	private String updateByUserName;

	private String description;

	private List<String> tagsUuid = new ArrayList<>();

	private List<TagResponseDto> tags;

	private MicroClusterResponseDto microClusterDetails;

	private List<TagResponseDto> tagResponses = new ArrayList<>();

	private List<String> shiftAllocationUuids = new ArrayList<>();

	private List<ShitAllocationDetailsResponse> templateDetails = new ArrayList<>();

	private List<ShiftAllocationDto> shiftsAllocationDtos = new ArrayList<>();



}