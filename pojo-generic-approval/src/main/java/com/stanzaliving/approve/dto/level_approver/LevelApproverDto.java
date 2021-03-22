package com.stanzaliving.approve.dto.level_approver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LevelApproverDto {

    @NotNull(message = "Level name cannot be null")
    @NotBlank(message = "Level name cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Level name should be minimum 3 and maximum 45")
    String levelName;

}
