package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomInventoryDetailsRequestDto {

    String roomUuid;
    List<String> inventoryUuids;
}
