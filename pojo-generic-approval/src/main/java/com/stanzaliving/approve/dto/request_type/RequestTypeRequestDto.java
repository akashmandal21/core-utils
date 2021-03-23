package com.stanzaliving.approve.dto.request_type;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestTypeRequestDto {

    @NotNull(message = "Request type cannot be null")
    @NotBlank(message = "Request type cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Request type should be minimum 3 and maximum 45")
    private String requestType;

    @NotNull(message = "LevelUUID cannot be null")
    @NotBlank(message = "LevelUUID cannot be blank")
    private String levelUUID;

}
