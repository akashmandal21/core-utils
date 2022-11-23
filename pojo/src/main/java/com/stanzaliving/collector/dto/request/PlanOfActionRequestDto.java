package com.stanzaliving.collector.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlanOfActionRequestDto {
    @NotNull
    String planOfAction;
    @NotNull
    LocalDate nextFollowupDate;
    String comment;
    @NotNull
    String bookingUuid;
    @NotNull
    String ventaUserUuid;
}
