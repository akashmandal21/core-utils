package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.leadservice.dto
 * @date 08/05/22
 * @time 21:55
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