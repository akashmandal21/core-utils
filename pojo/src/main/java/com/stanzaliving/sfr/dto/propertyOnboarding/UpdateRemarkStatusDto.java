package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class UpdateRemarkStatusDto {
    private String propertyId;
    private List<LegalAllRemarksResponseDto> remarkDetails;
}
