package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TransportBrandDetailDto {

    private boolean availableAsVas;
    private String freeDistance;
    private String brandName;
    private String serviceDetailId;

}
