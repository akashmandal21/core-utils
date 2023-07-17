package com.stanzaliving.core.client.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyHandOverRequestDto {

    @Builder.Default
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate keyHandoverDate = LocalDate.now();

    @NotNull
    private String keyHandoverAction;

}
