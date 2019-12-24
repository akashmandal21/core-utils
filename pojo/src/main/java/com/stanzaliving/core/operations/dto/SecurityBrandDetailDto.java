package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SecurityBrandDetailDto {

    private String serviceId;
    private Date startTime;
    private Date endTime;
    private String brandName;
}
