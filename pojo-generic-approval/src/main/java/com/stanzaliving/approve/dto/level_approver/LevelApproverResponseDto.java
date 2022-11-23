package com.stanzaliving.approve.dto.level_approver;

import com.stanzaliving.approve.dto.mail_template.MailConfigurationDto;
import com.stanzaliving.approve.dto.role.RoleResponseDto;
import lombok.*;

import javax.validation.Valid;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LevelApproverResponseDto {

    private Long id;

    private String levelName;

    private String levelUUID;

    private String entityName;

    private List<RoleResponseDto> roles;

    private List<MailConfigurationDto> mailConfigurationDto;

    private String accessLevel;
}
