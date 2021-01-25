package com.stanzaliving.events.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @author Piyush Srivastava
 *
 * @date 02-Mar-2020
 */


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class EventDto {
    @NotBlank(message = "event name must not be empty")
    private String name;

    @NotBlank(message = "event type must not be empty")
    private String type;

    @NotBlank(message = "event source must not be empty")
    private String source;

    private String subType;

}
