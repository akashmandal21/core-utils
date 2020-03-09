package com.stanzaliving.events.dto;


import lombok.*;

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

public class EventDto {
    @NotEmpty
    @NotNull
    private String name;


    @NotEmpty
    @NotNull
    private String type;

    @NotEmpty
    @NotNull
    private String source;


    private String subType;

}
