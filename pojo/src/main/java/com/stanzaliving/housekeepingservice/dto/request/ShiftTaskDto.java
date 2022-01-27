package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftTaskDto {

    private List<String> taskUuids;

    private String shiftUuid;

    private String shiftDuration;

    private String shiftName;

    private String shiftTime;
}
