package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintTypeResidenceMigrationDto {

    @JsonSetter(value = "complaint_type_uuid")
    private String complaintTypeUuid;

    @JsonSetter(value = "residence_id")
    private String residenceId;




}