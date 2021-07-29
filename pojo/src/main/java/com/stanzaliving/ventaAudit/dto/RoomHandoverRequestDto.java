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
public class RoomHandoverRequestDto {

    private RoomHandoverElements elementName;
    @Builder.Default
    private Boolean elementStatus=false;
    private Double elementValue;
    private List<String> elementImageUrl;
    private String uuid;
}
