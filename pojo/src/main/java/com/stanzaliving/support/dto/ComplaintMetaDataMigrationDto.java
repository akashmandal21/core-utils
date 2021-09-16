package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintMetaDataMigrationDto {
    @JsonSetter(value="uuid")
    private String complaintUuid;

    @JsonSetter(value="complaint_type_uuid")
    private String complaintTypeUuid;

    @JsonSetter(value="complaint_category_uuid")
    private String complaintCategoryUuid;

    @JsonSetter(value="complaint_sub_category_uuid")
    private String complaintSubCategoryUuid;

    @JsonSetter(value="complaint_status")
    private String complaintStatus;

    @JsonSetter(value="description")
    private String description;

    @JsonSetter(value="priority")
    private String priority;

    @JsonSetter(value="satisfied")
    private String satisfied;

    @JsonSetter(value="resolved_at")
    private String resolvedAt;

    @JsonSetter(value="closed_at")
    private String closedAt;


}
