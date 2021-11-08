package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.housekeepingservice.enums.HKPlanningTemplateStatus;
import com.stanzaliving.housekeepingservice.enums.HkTemplateSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 17-Sep-21
 **/
@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkTemplateFilterDto {

    private String templateName;
    private String microClusterUuid;
    private String templateUuid;
    private List<String> tagList;
    private HKPlanningTemplateStatus templateStatus;
    private String createdBy;
    private PaginationRequest pageRequest;

    //Sort
    private HkTemplateSortSpecs sortSpecs;
    private SortDirection sortDirection;

}
