package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LegalAllRemarksRequestDto {
    private String propertyId;
    private List<String> variableNames;
}
