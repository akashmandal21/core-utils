package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


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

    private String ppPlanningTemplateName;

    private String addedBy;

//    private DateTimeRangeDto addedBetween;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:SS")
    private Date startDate;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:SS")
    private Date endDate;

    private String status;

    private PaginationRequest pageRequest;
}