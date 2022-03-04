package com.stanzaliving.core.client.dto;

import java.util.Date;
import java.util.Set;

import com.stanzaliving.core.dto.DocumentAssetDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionOnboardingDetailsDto {

    private Double transactionAmount;
    private String bookingUuid;
    private String userUuid;
    private Double bookingAmount;
    private String idProofName;
    private String idProofNumber;
    private Set<DocumentAssetDTO> idProofImage;
    private Double unmappedPaymentAmount;
    private String paymentProofImage;
    private String reason;
    private String createdBy;
    private Date createdAt;
}