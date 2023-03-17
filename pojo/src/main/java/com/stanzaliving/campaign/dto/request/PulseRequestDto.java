package com.stanzaliving.campaign.dto.request;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class PulseRequestDto {
    private List<String> residenceUuidList;
    private LocalDate startDate;
    private LocalDate endDate;
}
