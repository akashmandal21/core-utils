package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationalInstitutionResponseDto {
    private Long educationalInstitutionId;
    private String educationalInstitutionUuid;
    private String name;

    private boolean enabled;
}