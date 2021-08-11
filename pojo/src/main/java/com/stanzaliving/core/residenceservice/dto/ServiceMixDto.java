package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceMixDto {
    private String serviceMixName;
    private String  approvedBy;
    private String approvedTime;
    private String uuid;
}
