package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintSubCategoryMigrationDto {

    @JsonSetter(value = "name")
    private String name;

    @JsonSetter(value = "estimated_time_of_repair")
    private String estimatedTimeOfRepair;

    @JsonSetter(value = "complaint_category_uuid")
    private String complaintCategoryUuid;


}
