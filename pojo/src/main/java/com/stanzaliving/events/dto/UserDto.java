package com.stanzaliving.events.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Piyush Srivastava
 *
 * @date 02-Mar-2020
 */


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    @NotEmpty(message = "userId must not be empty")
    protected String userId;

    protected String userName;
}
