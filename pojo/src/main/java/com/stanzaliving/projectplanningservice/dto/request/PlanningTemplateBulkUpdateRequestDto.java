package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.projectplanningservice.dto.PlanningTemplateDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;


/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlanningTemplateBulkUpdateRequestDto implements Serializable {

    private static final long serialVersionUID = 1635296868115644218L;

    private List<String> templateUuids;

    private PlanningStatus status;
}