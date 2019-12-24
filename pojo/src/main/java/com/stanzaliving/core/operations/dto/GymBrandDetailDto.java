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
public class GymBrandDetailDto {

    private String serviceDetailId;
    private Date startTime;
    private Date endTime;
    private boolean availableAsVas;
    private String brandName;

}
