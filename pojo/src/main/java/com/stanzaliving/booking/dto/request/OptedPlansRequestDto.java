package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptedPlansRequestDto {

    @NotBlank(message = "planUuid cannot be null")
    @Valid
    private String planUuid;

    @NotNull(message = "optInDate cannot be null")
    @Valid
    private Date optInDate;
}
