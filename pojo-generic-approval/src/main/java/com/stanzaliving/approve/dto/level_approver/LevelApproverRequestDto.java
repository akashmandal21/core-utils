package com.stanzaliving.approve.dto.level_approver;

import com.stanzaliving.approve.dto.mail_template.MailConfigurationDto;
import com.stanzaliving.approve.util.validation.MaxSizeConstraint;
import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;

import javax.validation.Valid;
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

    @NotNull(message = "Entity name cannot be null")
    @NotBlank(message = "Entity name cannot be blank")
    @Size(max = 45, min = 3, message = "Character length of Entity name should be minimum 3 and maximum 45")
    private String entityName;

    @NotNull(message = "RoleUUID cannot be null")
    @NotEmpty(message = "RoleUUID cannot be empty")
    private List<String> roleUUID;


    private AccessLevel accessLevel;

    @MaxSizeConstraint(message = "Maximum array size of mail configuration is 2")
    private List<@Valid MailConfigurationDto> mailConfigurationDto;
}
