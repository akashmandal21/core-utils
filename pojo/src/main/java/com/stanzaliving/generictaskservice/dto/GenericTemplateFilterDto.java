package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.enums.GenericTemplateSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class GenericTemplateFilterDto {

    private String name;
    private String statusUuid;
    private String categoryUuid;
    private String templateUuid;
    private String subCategoryUuid;
    private String module;
    private Department department;
    private PaginationRequest pageRequest;

    //Sort
    private GenericTemplateSortSpecs sortSpecs;
    private SortDirection sortDirection;

}

