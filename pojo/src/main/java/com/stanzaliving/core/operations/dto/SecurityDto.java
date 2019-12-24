package com.stanzaliving.core.operations.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SecurityDto {

    private String serviceName;
    private String serviceId;
    private boolean commonDetails;
    List<SecurityBrandDetailDto> securityBrandDetailDtoList;

}
