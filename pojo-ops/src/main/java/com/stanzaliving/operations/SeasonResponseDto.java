package com.stanzaliving.operations;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeasonResponseDto {
    private String fromDate;
    private String toDate;
    private String seasonName;
    private String uuid;
    private String createdBy;
    private String createdAt;
}
