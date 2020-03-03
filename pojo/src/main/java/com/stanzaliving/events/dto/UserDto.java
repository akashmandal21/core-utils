package com.stanzaliving.events.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    @NotEmpty
    @NotNull
    protected String userId;

    protected String userName;
}
