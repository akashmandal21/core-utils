package com.stanzaliving.core.commercialcode.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardListDto {

    List<CodeListDto> availabilityCodes;

    List<CodeListDto> unavailableCodes;
}
