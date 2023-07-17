package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConductAuditDto {
    @Min(value = 0)
    private Double damageAmount;
    @NotBlank
    private DamageAssessed damageLevel;
    @NotBlank
    private String comments;
    @NotBlank
    private String auditDetailsUuid;
    private List<@NotBlank String> imageResponseDtoList;
}
