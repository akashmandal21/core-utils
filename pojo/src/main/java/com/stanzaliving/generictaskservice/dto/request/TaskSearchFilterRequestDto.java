package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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

    private List<String> modules;

    private List<String> owners;

    private List<String> predecessorTasks;

    private Boolean status;
}
