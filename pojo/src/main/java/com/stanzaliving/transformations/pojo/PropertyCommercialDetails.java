package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PropertyCommercialDetails {

    private String bedCount;

    private List<CommercialTypeDetails> commercialTypeDetails;

    private String fixedRent;

    private String managementFeePercentage;

}
