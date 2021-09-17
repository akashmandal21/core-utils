package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintSubCategoryMigrationDto {

    @JsonSetter(value = "id")
    private String id;

    @JsonSetter(value = "uuid")
    private String uuid;

    @JsonSetter(value = "name")
    private String name;

    @JsonSetter(value = "complaint_category_uuid")
    private String complaintCategoryUuid;

    @JsonSetter(value = "estimated_time_of_repair")
    private String estimatedTimeOfRepair;

    @JsonSetter(value = "created_at")
    private String createdAt;

    @JsonSetter(value = "created_by")
    private String createdBy;

    @JsonSetter(value = "status")
    private String status;

    @JsonSetter(value = "updated_at")
    private String updatedAt;

    @JsonSetter(value = "updated_by")
    private String updatedBy;



}
