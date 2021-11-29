package com.stanzaliving.housekeepingservice.dto.request;

import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author Vikas S T
 * @date 29-Nov-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaAppCreateTaskRequestDto {
    private LocalDate date;
    private String beatPlanUuid;
    private String pseudoPersonUuid;
    private GenericTaskDto genericTaskDto;
}
