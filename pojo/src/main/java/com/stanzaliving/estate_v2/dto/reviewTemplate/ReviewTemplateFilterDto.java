package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.core.dto.SortDto;
import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ReviewTemplateFilterDto extends UserDeptLevelRoleNameUrlExpandedDto {
    private SortDto sort;
    private int pageNo;
    private int limit;
    private FilterReviewTemplate filter;
}
