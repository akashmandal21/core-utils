package com.stanzaliving.sfr.dto.propertyOnboarding;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyNameDto {
    private String propertyName;
    private BrandName brandName;
    private SubBrandName subBrandName;
    private GenderAllowed gender;
    private String propertyAction;
    private boolean update;
    private Date createdAt;
}
