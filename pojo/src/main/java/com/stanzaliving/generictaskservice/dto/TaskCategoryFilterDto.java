package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.generictaskservice.enums.ShiftSortSpecs;
import com.stanzaliving.generictaskservice.enums.TaskCategorySortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 * @author Vikas S T
 * @date 11-Aug-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class TaskCategoryFilterDto {

    private String taskCategoryName;
    private List<String> tags;
    private PaginationRequest pageRequest;
    //Sort
    private LocalTime startTime;
    private String autoCompletionEvent;
    private boolean autoCompleteTask;
    protected Date createdAt;

    private TaskCategorySortSpecs sortSpecs;
    private SortDirection sortDirection ;
    private String uuid;
}
