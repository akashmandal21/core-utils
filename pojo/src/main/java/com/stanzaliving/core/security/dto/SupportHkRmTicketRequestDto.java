package com.stanzaliving.core.security.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupportHkRmTicketRequestDto {
    
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
}
