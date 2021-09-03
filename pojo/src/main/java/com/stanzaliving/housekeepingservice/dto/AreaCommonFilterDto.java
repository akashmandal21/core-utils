package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class AreaCommonFilterDto {

    private String areaName;

    private PaginationRequest pageRequest;
}
