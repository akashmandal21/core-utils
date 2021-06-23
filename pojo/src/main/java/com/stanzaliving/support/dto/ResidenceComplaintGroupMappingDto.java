package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceComplaintGroupMappingDto {
    private String residence;
    private String residenceUuid;
    private String complaintGroup;
    private String complaintGroupUuid;
    private boolean active;
}
