package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintCategoryMigrationDto {

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value="name")
    private String name;

    @JsonSetter(value="eligibility")
    private String eligibility;

    @JsonSetter(value="complaint_type_uuid")
    private String complaintTypeUuid;

    @JsonSetter(value="created_at")
    private String createdAt;

    @JsonSetter(value="created_by")
    private String createdBy;

    @JsonSetter(value="status")
    private String status;

    @JsonSetter(value="updated_at")
    private String updatedAt;

    @JsonSetter(value="updated_by")
    private String updatedBy;

}
