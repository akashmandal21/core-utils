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
public class RoomHandoverStatusResponseDto {

    private RoomHandoverElements elementName;
    private Boolean elementStatus;
    private Double elementValue;
    private List<ImageResponseDto> elementImageUrl;
    private String uuid;
}
