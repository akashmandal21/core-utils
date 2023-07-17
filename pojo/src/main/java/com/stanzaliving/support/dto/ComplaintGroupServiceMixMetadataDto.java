package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintGroupServiceMixMetadataDto {
    private String complaintGroupUuid;
    private String complaintGroup;
    private String description;
    private String imageUrl;
    private String imagePath;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdAt;
    private Date lastUpdatedAt;
    private List<ServiceMixMetadataDto> serviceMix;
    private Boolean serviceMixActive;
}
