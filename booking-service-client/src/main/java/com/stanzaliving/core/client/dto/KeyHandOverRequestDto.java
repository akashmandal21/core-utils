package com.stanzaliving.core.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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
