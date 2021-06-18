package com.stanzaliving.estate_v2.dto.reviewTemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor

public class BasicInformationResponse {
    private String propertyName;
    private String propertyType;
    private String micromarket;
    private String cityName;
    private String locationUrl;
}
