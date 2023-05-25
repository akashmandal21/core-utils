package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ConversionResponseDto {

    private String definition;

    private String label;

    private Map<LocalDate, String> data;

    private List<String> bookingIds;

    private double count;

    private List<String> leadUuids;

}
