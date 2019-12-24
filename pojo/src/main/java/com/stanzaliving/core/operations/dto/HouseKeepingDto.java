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
public class HouseKeepingDto {

    private String serviceName;
    private String serviceId;
    private boolean commonDetails;
    private String serviceDetailName;
    private List<HouseKeepingBrandDetailsDto> houseKeepingDetailsDtos;

}
