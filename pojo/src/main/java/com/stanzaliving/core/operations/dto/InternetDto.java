package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.operations.enums.Frequency;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetDto {

    private String serviceId;
    private boolean commonDetails;
    private List<InternetBrandDetailDto> internetBrandDetailDtos;

}
