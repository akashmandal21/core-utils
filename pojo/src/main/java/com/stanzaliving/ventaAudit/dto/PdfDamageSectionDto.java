package com.stanzaliving.ventaAudit.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PdfDamageSectionDto {
    private String areaName;
    private String itemName;
    private String damageLevel;
    private Double amount;
    private List<String> onBoardingImages;
    private List<String> auditImages;
    private String auditorRemarks;
}
