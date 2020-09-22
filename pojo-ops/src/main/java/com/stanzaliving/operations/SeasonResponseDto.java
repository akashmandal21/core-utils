package com.stanzaliving.operations;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeasonResponseDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String seasonName;
    private String uuid;
}
