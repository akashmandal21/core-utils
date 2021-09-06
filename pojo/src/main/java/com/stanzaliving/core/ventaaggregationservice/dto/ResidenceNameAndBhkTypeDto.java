package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceNameAndBhkTypeDto {
    private Integer residenceBhkType;
    private String residenceName;

}