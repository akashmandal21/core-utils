package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


/**
 * @author Priyadarshini MB
 *
 */

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class GenericTaskFilterDTO {

    private String name;
    private String statusUUID;
    private String taskCategoryUUId;
    private String taskSubCategoryUUId;//taskType
    private List<String> tagsUUIds;//tags
    private PaginationRequest pageRequest;
}
