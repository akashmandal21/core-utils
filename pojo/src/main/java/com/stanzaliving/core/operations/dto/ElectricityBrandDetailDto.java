package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ElectricityBrandDetailDto {

    private String serviceDetailId;
    private String statusType;
    private String paymentType;
    private String brandName;

}
