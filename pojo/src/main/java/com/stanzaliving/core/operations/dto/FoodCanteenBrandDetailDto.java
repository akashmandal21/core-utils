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
public class FoodCanteenBrandDetailDto {

    private String serviceDetailId;
    private boolean available;
    private boolean availableAsVas;
    private Date startTime;
    private Date endTime;
    private String brandName;

}
