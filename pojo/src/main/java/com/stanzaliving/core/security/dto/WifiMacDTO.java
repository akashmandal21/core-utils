package com.stanzaliving.core.security.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WifiMacDTO {

    @NotBlank(message = "MAC address cannot be blank")
    private String macAddress;

    private String residenceUuid;

    private boolean macStatus;
}
