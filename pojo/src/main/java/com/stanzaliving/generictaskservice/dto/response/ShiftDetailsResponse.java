package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 24-Aug-21
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftDetailsResponse {
    private String shiftUuid;
    private String module;
    private String shiftName;
    private Double durationInHours;
    private List<SlotDetailsResponse> slots;
}
