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
public class LaundryDto {

    private String serviceName;
    private String serviceDetailId;
    private boolean commonDetails;
    private List<LaundryBrandDetailDto> laundryBrandDetailDtos;

}
