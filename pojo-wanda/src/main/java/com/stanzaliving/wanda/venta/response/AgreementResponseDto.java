package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.venta.enums.ContractType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgreementResponseDto {
    private String bookingUuid;
    private String agreementUrl;
    private String agreementDocumentId;
    private String addendumDocumentId;
    private String addendumUrl;
    private String message;
    private Boolean status;
    private String referenceID2;
    private String studentName; 
    @Builder.Default
    private ContractType contractType=ContractType.NONE;
    private String subContract1StartDate;
    private String subContract1EndDate;
    private String secondSubContractAgreementSendDate;
    private String contractText;
    private String contract2Text;
    private Date createdAt;
}
