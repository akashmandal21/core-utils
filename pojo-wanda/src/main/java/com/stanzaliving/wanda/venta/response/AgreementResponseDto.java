package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.venta.enums.ContractType;

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
    private ContractType contractType;
    private String subContract1StartDate;
    private String subContract1EndDate;
    private String secondSubContractAgreementSendDate;
    private String contractText;
    private String contract2Text;
}
