package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.dto.SortDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PropertyFilterDto  extends PaginationRequest {
    private List<SortDto> sort;
    private FilterPropertyDto filter;
}
