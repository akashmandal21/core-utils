package com.stanzaliving.approve.dto.level_approver;

import lombok.*;

import java.util.Set;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessLevelApprovalStatusMapping {
    private String accessLevel;
    private Set<String> approvalStatus;
}
