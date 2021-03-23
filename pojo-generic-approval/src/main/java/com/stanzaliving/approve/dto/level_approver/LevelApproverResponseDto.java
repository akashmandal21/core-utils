package com.stanzaliving.approve.dto.level_approver;

import com.stanzaliving.approve.dto.role.RoleResponseDto;
import lombok.*;

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

    private String entityServiceName;

    private List<RoleResponseDto> roles;
}
