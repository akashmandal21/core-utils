package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKTaskExecutionReasonStatusDto {

    private String statusReason;
    private String reasonUuid;

}
