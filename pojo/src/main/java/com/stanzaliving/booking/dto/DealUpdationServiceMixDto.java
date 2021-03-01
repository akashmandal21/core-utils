package com.stanzaliving.booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DealUpdationServiceMixDto {
    
    private String dealUuid;
    private String residenceUuid;
    private String residentCode;
    private String residentName;
    private String serviceMixName;
    private String serviceMixUuid;
    private String status;
    private String serviceMixAssignedBy;

}
