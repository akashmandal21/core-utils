package com.stanzaliving.core.legal.dto.request;

import com.stanzaliving.core.legal.enums.LegalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLegalStatusDto {

    @NotEmpty(message = "uuid is mandatory")
    String uuid;

    @NotNull(message = "status is mandatory")
    LegalStatus legalStatus;
}
