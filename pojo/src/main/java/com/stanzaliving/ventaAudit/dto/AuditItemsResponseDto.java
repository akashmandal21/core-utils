package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditItemsResponseDto {
    private String roomName;
    private String itemName;
    private DamageAssessed damageLevel;
    private Double damageAmount;
    private String comments;
    private List<String> onboardingImageUrl;
    private List<String> auditImageUrl;
    private String auditDetailsUuid;

}
