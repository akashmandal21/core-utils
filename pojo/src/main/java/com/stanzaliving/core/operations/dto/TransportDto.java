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
public class TransportDto {

    private String serviceName;
    private String serviceDetailId;
    private boolean commonDetails;
    private List<TransportBrandDetailDto> transportBrandDetailDtoList;

}
