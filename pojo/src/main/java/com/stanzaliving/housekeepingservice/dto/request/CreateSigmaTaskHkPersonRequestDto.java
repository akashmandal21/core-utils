package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import lombok.*;

/**
 * @author Vikas S T
 * @date 13-Oct-21
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreateSigmaTaskHkPersonRequestDto {
    private String hkPersonUuid;
    private GenericTaskDto genericTaskDto;
}
