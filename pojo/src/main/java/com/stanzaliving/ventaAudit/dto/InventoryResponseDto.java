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
public class InventoryResponseDto {
    private  String bookingUuid;
    private String entityUuid;
    private String roomName;
    private String roomUuid;
    private String roomElementsName;
    private String roomElementsUuid;
    private Double quantity;
    private List<ImageResponseDto> onboardingImageUrl;
    private String inventoryChecklistUuid;
}
