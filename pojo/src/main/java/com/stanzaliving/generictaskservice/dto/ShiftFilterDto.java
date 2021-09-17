package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.generictaskservice.enums.ShiftSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
public class ShiftFilterDto {
    private String shiftName;
    private Double shiftDuration;
    private List<String> tagList;
    private PaginationRequest pageRequest;

    //Sort
    private ShiftSortSpecs sortSpecs;
    private SortDirection sortDirection;
}
