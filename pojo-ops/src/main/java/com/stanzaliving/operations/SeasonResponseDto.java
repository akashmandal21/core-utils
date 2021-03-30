package com.stanzaliving.operations;

import com.stanzaliving.core.operations.enums.DealCategory;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeasonResponseDto implements Serializable {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String seasonName;
    private int seasonNumber;
    private String uuid;
    private boolean active;
    private String createdBy;
    private LocalDate createdAt;
    private DealCategory dealCategory;
}
