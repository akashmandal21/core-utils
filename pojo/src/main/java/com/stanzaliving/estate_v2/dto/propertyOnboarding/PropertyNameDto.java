package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.*;

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
    private boolean update;
}
