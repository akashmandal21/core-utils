package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgreementResponseDto {
    private String bookingUuid;
    private String agreementUrl;
    private String agreementId;
    private String message;
    private Boolean status;
   
    private String studentName; 
    private String contractType;
    private String subContract1StartDate;
    private String subContract1EndDate;
    private String subContract2StartDate;
    private String subContract2EndDate;
}
