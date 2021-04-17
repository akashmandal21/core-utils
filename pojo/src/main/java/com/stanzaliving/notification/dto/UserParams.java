package com.stanzaliving.notification.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserParams {

    @NotBlank(message = "User id cannot be blank or null")
    private String userId;

    @NotNull(message = "User params cannot be null")
    private HashMap<String, String> params;
}
