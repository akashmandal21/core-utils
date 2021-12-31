package com.stanzaliving.internet.response;

import java.time.LocalDate;

import com.stanzaliving.core.enums.DataUnit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoosterPackSuccessResponseDto {

	private String planName;

	private Double planData;

	private DataUnit dataUnit;

	private LocalDate rechargeDate;

	private LocalDate planExpiry;
}