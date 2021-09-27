package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
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
    private String subCategoryUuid;
    private PaginationRequest pageRequest;

}

