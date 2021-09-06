package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceNameAndBhkTypeDto implements Serializable {
    private Integer residenceBhkType;
    private String residenceName;
    private String residenceUuid;
    private String microMarketId;


}