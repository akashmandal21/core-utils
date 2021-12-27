package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.SlotDetailsResponse;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkSlotsPersonsForTask {

    private String personName;
    private String beatPersonId;
    private List<SlotDetailsResponse> slots;
}
