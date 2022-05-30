package com.stanzaliving.estate_v2.dto.propertyOnboarding;

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
