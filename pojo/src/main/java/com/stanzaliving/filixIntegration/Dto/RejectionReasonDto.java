package com.stanzaliving.filixIntegration.Dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RejectionReasonDto {
    private String document;
    private String reason;
}
