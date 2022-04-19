package com.stanzaliving.core.security.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceDTO {
    private String cityUuid;

    private String cityName;

    private String micromarketUuid;

    private String micromarketName;

    private String residenceUuid;

    private String residenceName;
}
