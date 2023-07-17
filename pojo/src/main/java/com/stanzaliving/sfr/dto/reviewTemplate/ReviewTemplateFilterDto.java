package com.stanzaliving.sfr.dto.reviewTemplate;

import com.stanzaliving.core.dto.SortDto;
import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.stanzaliving.sfr.dto.reviewTemplate.filter.DynamicFilterResponseDTO;
import com.stanzaliving.sfr.dto.reviewTemplate.filter.PropertyResponseFilterDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ReviewTemplateFilterDto extends UserDeptLevelRoleNameUrlExpandedDto {
    private SortDto sort;
    private int pageNo;
    private int limit;
    private PropertyResponseFilterDto moreFilters;
    private List<DynamicFilterResponseDTO> dynamicFilterResponse;
}
