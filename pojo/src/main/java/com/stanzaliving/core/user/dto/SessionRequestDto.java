package com.stanzaliving.core.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SessionRequestDto {

    @NotEmpty
    String email;
    @NotEmpty
    String token;
}
