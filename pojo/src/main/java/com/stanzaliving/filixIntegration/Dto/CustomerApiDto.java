package com.stanzaliving.filixIntegration.Dto;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerApiDto {

    private FilixBookingResponseDto filixBookingResponseDto;
    private FilixBookingDto booking;
    private FilixUserDetailResponseDto filixUserDetailResponseDto;
    private FilixPaymentTransactionRequestDto filixPaymentTransactionRequestDto;
    private FilixTransactionInitiateDto filFilixTransactionInitiateDto;
    private FilixInvoiceDto filixInvoiceDto;
    private FilixResidenceDetailsDto filixResidenceDetailsDto;
    private FilixOnBoardingGetResponse onBoardingGetResponse;
    private FilixResidentKYCDocumentResponseDto residentKYCDocumentResponseDto;
    private FilixTransactionDto filixTransactionDto;


}