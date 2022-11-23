package com.stanzaliving.core.commercialcode.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommercialCardListDto {

    List<CodeListDto> availabilityCodes;

    List<CodeListDto> unavailableCodes;
}
