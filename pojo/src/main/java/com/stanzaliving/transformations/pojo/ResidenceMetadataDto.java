package com.stanzaliving.transformations.pojo;


import com.stanzaliving.core.enums.ResidenceType;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMetadataDto {

    private long residenceId;

    private String uuid;

    private String residenceName;

    private String microMarketUuid;
    
    private ResidenceType residenceType;
    
}