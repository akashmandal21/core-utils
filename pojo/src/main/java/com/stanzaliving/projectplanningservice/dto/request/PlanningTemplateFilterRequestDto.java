package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlanningTemplateFilterRequestDto implements Serializable {

    private static final long serialVersionUID = 1635296868115644218L;

    private String planningTemplateName;

    private List<String> addedBy;

    private Date startDate;

    private Date endDate;

    private List<PlanningStatus> planningStatus;

    private String orderByColumnName;

    private String orderBy;

    private PaginationRequest pageRequest;
}