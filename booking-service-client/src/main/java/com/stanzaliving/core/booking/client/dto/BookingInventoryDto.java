package com.stanzaliving.core.booking.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingInventoryDto {

    private List<String> roomUUID;
    private String moveInDate;
//    private List<String> inventoryUUID;

}
