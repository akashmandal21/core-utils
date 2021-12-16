package com.stanzaliving.core.client.dto;

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
    private LocalDate keyHandoverDate = LocalDate.now();

    @NotNull
    private String keyHandoverAction;

}
