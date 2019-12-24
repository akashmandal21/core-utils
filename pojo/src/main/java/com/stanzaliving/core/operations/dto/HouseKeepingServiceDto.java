package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class HouseKeepingServiceDto {

    private String serviceName;
    private String serviceId;
    private boolean available;

    private HouseKeepingHostelDto houseKeepingHostelDto;

    private HouseKeepingSuitsDto houseKeepingSuitsDto;
}
