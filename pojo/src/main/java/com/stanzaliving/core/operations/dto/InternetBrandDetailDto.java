package com.stanzaliving.core.operations.dto;


import com.stanzaliving.core.operations.enums.Frequency;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetBrandDetailDto {

    private String serviceId;
    private String serviceName;
    private String speed;
    private String data;
    private Frequency frequency;
    private String brandName;

}
