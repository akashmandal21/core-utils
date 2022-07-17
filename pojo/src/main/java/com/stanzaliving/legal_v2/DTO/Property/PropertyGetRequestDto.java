package com.stanzaliving.legal_v2.DTO.Property;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.dto.SortDto;
import com.stanzaliving.legal_v2.DTO.Filters.FilterPropertyDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PropertyGetRequestDto extends PaginationRequest {

    private List<SortDto> sort;

    private FilterPropertyDto filter;
}
