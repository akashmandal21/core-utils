package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.RoomHandoverElements;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OnboardingDetailsDto {
    List<RoomHandoverStatusResponseDto> roomHandoverStatusResponseDtos;
    List<InventoryResponseDto> inventoryResponseDtos;
}
