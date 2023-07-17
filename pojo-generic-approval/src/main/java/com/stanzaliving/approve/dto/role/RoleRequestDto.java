package com.stanzaliving.approve.dto.role;

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
public class RoleRequestDto {

    @NotNull(message = "Role name cannot be null")
    @NotBlank(message = "Role name cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Role name should be minimum 3 and maximum 45")
    private String roleName;

}
