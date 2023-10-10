package com.stanzaliving.residenceservice.Dto;

import com.stanzaliving.residenceservice.enums.ResidenceAttributes;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceAttributesRequestDto {

    private String bookingType;
    private String residenceUuid;
    private List<ResidenceAttributes> residenceAttributes;

}