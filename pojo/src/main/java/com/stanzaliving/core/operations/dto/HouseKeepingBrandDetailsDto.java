package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class HouseKeepingBrandDetailsDto {

    private boolean available;
    private Date startTime;
    private Date endTime;
    private List<String> days;
    private String serviceId;
    private String brandName;
}
