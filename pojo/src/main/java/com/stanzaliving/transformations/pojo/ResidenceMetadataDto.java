package com.stanzaliving.transformations.pojo;


import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.enums.ResidenceType;

import com.stanzaliving.core.estate.enums.EstateGender;
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

    private String parentResidenceId;
    
    private PropertyEntityType propertyEntityType;
    
    private String phoenixPropertyUuid;

    private String code;

    private String category;

    private String company;

    private String addressUuid;

    private EstateGender estateGender;

    private boolean bookingStatus;

}