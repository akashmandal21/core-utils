package com.stanzaliving.core.client.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.stanzaliving.booking.dto.PaymentDetailsDto;
import com.stanzaliving.wanda.dtos.BankDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDetailsResponseDto {

    private String bookingUuid;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate moveOutDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate actualMoveOutDate;

    private Double dues;

    private String actualEndDateNote;

    private String confirmationNote;

    private List<String> confirmationNotesSplit;

    private String confirmationNotePS;

    private List<PaymentDetailsDto> paymentDetails;

    private boolean isEligibleForExitInitiation = true;

    private BankDetailsDto bankDetails;

    private String exitReason;

    private String exitReasonUuid;

    private String defaulterUuid;

    private String defaulterReason;

    private String roomKeyHandOverStatus;

    private Date contractStartDate;

    private Date contractEndDate;

    private Integer noticePeriod;

    private String zhComments;

    private String exitReasonNote;

    private String bookingStatus;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate auditDate;

    private Double securityDeposit;

    private String exitSource;

    private Double futureDues;

    Map<String, UserExitAnswerAndTypeResponseDto> userExitReasons;

    private Boolean isMoveOutDateExceeded;

    private LocalDate lastScanDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate maxMoveOutDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate minMoveOutDate;


    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate chargedTillDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate noticePeriodStartDate;
}
