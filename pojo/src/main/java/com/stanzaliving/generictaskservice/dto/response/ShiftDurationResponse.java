package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftDurationResponse {

    long shiftDuration;

}