package com.stanzaliving.approve.dto.request_type;

import com.stanzaliving.approve.dto.level_approver.LevelApproverResponseDto;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestTypeResponseDto {
    private Long id;

    private String requestType;

    private String requestTypeUUID;

    private LevelApproverResponseDto level;
}
