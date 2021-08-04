package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/4/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class PlaningTemplatesDto {
	private String uuid;

	@NotBlank(message = "Template name is mandatory")
	private String templateName;

	private int templateDuration;

	private String microclusterUuid;

	private List<String> applicableEntities = new ArrayList<>();

	private List<String> tags = new ArrayList<>();

	private List<String> shiftAllocationUuid = new ArrayList<>();
}
