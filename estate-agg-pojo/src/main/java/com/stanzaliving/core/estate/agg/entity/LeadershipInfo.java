package com.stanzaliving.core.estate.agg.entity;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadershipInfo {
    @Indexed
    private BrandName brandName;
    @Indexed
    private SubBrandName subBrandName;

    private GenderAllowed gender;
    @TextIndexed
    private String propertyName;

}



