package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class InputFieldsDto {

    private String ruleNo;
    private int inputField;
    private int inputFieldPreBooking;
    private int inputFieldBooking;
}
