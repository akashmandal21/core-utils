package com.stanzaliving.support.dto;


import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourDto {
    @NotEmpty(message = "primary reference uuid can't be left blank.")
    private List<String> primaryReferenceUuid;

    private List<String> city;

    private List<String> micromarket;

    private List<String> residence;

    private LocalTime StartTime;

    private LocalTime EndTime;

    private LocalTime BufferTime;
}
