package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;

import java.time.LocalDate;

/**
 * @author Vikas S T
 * @date 24-Oct-21
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MappedBeatPlanResponseDto {
    private String uuid;
    private LocalDate beatPlanStartDate;
    private LocalDate beatPlanEndDate;
}
