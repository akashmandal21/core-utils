package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.enums.ResidenceType;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMetadataDto {
    
    private long id;

    private long residenceId;
    private long allowedVisitDays;

    private String uuid;
    private String code;
    private String company;
    private String category;
    private String addressUuid;
    private String residenceName;
    private String microMarketUuid;
    private String parentResidenceId;
    private String phoenixPropertyUuid;

    private ResidenceType residenceType;
    private PropertyEntityType propertyEntityType;

}