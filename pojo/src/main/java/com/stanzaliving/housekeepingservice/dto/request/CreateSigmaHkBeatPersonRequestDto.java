package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

/**
 * @author Vikas S T
 * @date 14-Oct-21
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreateSigmaHkBeatPersonRequestDto {
    private String hkPersonName;
    private LocalDate date;
    private String hkPseudoUuid;
}
