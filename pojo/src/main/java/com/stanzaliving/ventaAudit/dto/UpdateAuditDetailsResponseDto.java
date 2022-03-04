package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAuditDetailsResponseDto {

    private String roomName;
    private String roomUuid;
    private String roomElementsUuid;
    private String itemName;
    private DamageAssessed damageLevel;
    private Double damageAmount;
    private List<AuditLogDto> auditLogDto;
    private List<String> onboardingImageUrl;
    private List<String> auditImageUrl;

}
