package com.stanzaliving.generictaskservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 04-Oct-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkSlotRequestDto {

    private String uuid;

    @NotBlank(message = "StartingTime is mandatory")
    private LocalTime startingTime;

    @NotBlank(message = "EndingTime is mandatory")
    private LocalTime endingTime;
}
