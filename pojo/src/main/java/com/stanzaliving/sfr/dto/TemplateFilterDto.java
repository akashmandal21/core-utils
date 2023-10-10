package com.stanzaliving.sfr.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.dto.SortDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TemplateFilterDto extends PaginationRequest {
    private List<SortDto> sort;
    private FilterTemplateDto filter;
}