package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditDetailsDto {
    @NotBlank(message = "Item name is Required")
    private String itemName;
    @NotEmpty(message = "Images are required")
    private List<ImageResponseDto> auditImageUrl;
    @Valid
    private DamageAssessed damageLevel;
    @Min(value = 0)
    private Double damageAmount;
    @NotBlank(message = "Damage amount is Required")
    private String comments;
    @NotBlank(message = "Inventory Checklist Uuid is Required")
    private String inventoryChecklistUuid;
    private String uuid;

}
