package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleFilterDto {
    private List<String> primaryReferenceUuid;
    private List<String> referenceUuid;
    private List<String> createdBy;
    private List<String> lastUpdatedBy;
    private Boolean isActive;
    /*
    * true for active
    * false for inactive
    * null for all
    * */

}
