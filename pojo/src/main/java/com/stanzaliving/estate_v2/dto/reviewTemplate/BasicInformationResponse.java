package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.core.user.dto.Address;
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
    private double lat;
    private double lon;
    private Long cityId;
    private Address address;
    private Long micromarketId;
    private String estateStatus;
}
