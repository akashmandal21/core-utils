package com.stanzaliving.productmix.dto.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomRequestDto {
    private String roomNumber;

    private int position;

    private int floor;

    private String roomTemplateUuid;
}
