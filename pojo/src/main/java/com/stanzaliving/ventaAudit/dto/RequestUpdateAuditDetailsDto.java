package com.stanzaliving.ventaAudit.dto;



import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import com.stanzaliving.ventaAudit.enums.ReasonForChange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestUpdateAuditDetailsDto {
    @NotBlank(message = "audit-details-uuid can not be empty")
    private String auditDetailsUUID;
    @Valid
    private DamageAssessed damageLevel;
    @Min(value = 0)
    private Double damageAmount;
    private String changeRemarks;
    @Valid
    private ReasonForChange reasonForChange;
    @NotBlank(message = "name of the person updated must be there")
    private String auditorUuid;

}
