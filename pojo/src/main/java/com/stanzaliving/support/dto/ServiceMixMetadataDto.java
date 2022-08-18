package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMixMetadataDto {
    private String serviceName;
    private String subService;
    private String uuid;
    private Boolean activeForComplaintGroup = Boolean.FALSE;
}
