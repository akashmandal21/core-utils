package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

    protected String name;
    protected List<String> taskIds;
    private PaginationRequest pageRequest;
}

