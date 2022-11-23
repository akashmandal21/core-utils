package com.stanzaliving.ventaAudit.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestRejectAuditDto {
    @NotBlank(message="audit id can not be Null or Empty")
    private String auditUuid;
    @NotBlank(message="rejection reason can not be Null or Empty")
    private String rejectionReason;
    @NotBlank(message="Action By can not be Null or Empty")
    private String userUuid;

}
