package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDealAndInventoryDto {

    String ContractUuid;
    LocalDate fromDate;
    LocalDate toDate;
    LocalDate oldToDate;
    LocalDate oldFromDate;
    Map<String,String> roomNumber;
    Set<String> oldRoomNumber;
}
