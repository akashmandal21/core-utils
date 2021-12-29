package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.ShiftDetailsResponse;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKSlotsAndShiftsDto {

    private Map<String, List<ShiftDetailsResponse>> hkSlotsAndShiftsMap;
}
