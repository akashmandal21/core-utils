package com.stanzaliving.booking.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDatesResponseDto {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate minExitDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate maxExitDate;
}
