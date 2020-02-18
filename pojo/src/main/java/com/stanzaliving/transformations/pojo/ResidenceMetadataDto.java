package com.stanzaliving.transformations.pojo;


import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.transformations.enums.BrandName;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMetadataDto {

    private long microMarketId;

    private String uuid;

    private String residenceName;

}
