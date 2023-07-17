package com.stanzaliving.wanda.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserExitReasonRequestDto {

    @NotNull(message = "reasons can not be null")
    private Map<String, String> reasons;

    @NotNull(message = "bookingUuid can not be null")
    @NotBlank(message = "bookingUuid can not be empty")
    private String bookingUuid;
}
