package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @date 02-Sep-21
 **/

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskSearchFilterRequestDto {

    private String taskName;

    private List<String> taskUuids;

    private boolean taskTemplate;

    private String orderBy;

    private String orderByColumnName;

    private PaginationRequest pageRequest;
}
