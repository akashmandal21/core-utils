package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.core.dto
 * @date 09/05/22
 * @time 02:09
 * @project_name lead-management
 **/

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeadElasticDto extends PaginationRequest {
    private long startDate;
    private long finalDate;
    private boolean completeSync;
}