package com.stanzaliving.core.deal.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.deal.client.enums.UserStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealApprovedUserResponseDto {

    private UserStatusType userStatus;

    private String name;

    private String userCode;

    private String phone;

    private String email;

    private String identification;

    @JsonFormat(pattern="dd MMM`YY")
    private LocalDate expectedMoveOutDate;

    @JsonFormat(pattern="dd MMM`YY")
    private LocalDate expectedMoveInDate;

    @JsonFormat(pattern="dd MMM`YY")
    private LocalDate actualMoveOutDate;

    private BigDecimal dues;

    private String contractUserUuid;

    private String bookingUuid;
}
