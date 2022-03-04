package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StayDetailsDto {
    private String roomNumber;
    private String residenceName;
    private String residenceAddress;
    private String microMarketName;
    private String cityName;
    private String stateName;
    private String cityPinCode;
    private String contractStartDate;
    private String contractEndDate;
}
