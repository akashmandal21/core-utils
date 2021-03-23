package com.stanzaliving.approve.dto.level_approver;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LevelApproverRequestDto {

    @NotNull(message = "Level name cannot be null")
    @NotBlank(message = "Level name cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Level name should be minimum 3 and maximum 45")
    private String levelName;

    @NotNull(message = "Entity service name cannot be null")
    @NotBlank(message = "Entity service name cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Entity service name should be minimum 3 and maximum 45")
    private String entityServiceName;

    @NotNull(message = "RoleUUID cannot be null")
    @NotEmpty(message = "RoleUUID cannot be empty")
    private List<String> roleUUID;
}
