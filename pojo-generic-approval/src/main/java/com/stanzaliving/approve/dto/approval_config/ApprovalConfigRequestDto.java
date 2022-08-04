package com.stanzaliving.approve.dto.approval_config;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalConfigRequestDto {
    private String entityName;
    private Boolean isApprovalEnabled;
}
