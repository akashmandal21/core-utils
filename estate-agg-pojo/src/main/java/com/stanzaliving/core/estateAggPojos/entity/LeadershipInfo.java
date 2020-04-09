package com.stanzaliving.core.estateAggPojos.entity;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadershipInfo {
    private BrandName brandName;

    private SubBrandName subBrandName;

    private GenderAllowed gender;

    private String propertyName;

}
