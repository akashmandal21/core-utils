package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitReasonRequestDto {

    private String reasonUuid;

    private String reason;

    @Pattern(regexp = "RENT_DEFAULTER|CONTRACT_TERMINATED",
            message = "Invalid booking status")
    private String bookingUuid;
}
