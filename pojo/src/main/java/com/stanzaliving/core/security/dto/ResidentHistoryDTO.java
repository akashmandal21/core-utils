package com.stanzaliving.core.security.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentHistoryDTO {

    private String residentUuid;

    private String firstName;

    private String lastName;

    private String residentCode;

    private Integer presentPercentage;

    private Set<ResidentDateDTO> dates;
}
