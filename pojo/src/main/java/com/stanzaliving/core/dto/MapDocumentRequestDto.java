package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapDocumentRequestDto {

    @NotBlank
    private String newBookingUuid;
    private String residentUuid;
    private String residentCode;
    @NotBlank
    private String documentUuid;

}
