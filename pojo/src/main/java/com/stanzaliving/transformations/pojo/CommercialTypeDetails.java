package com.stanzaliving.transformations.pojo;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommercialTypeDetails {

    private Double applicableMonth;

    private String commercialType;

    private String isMgApplicable;

    private String mgAmount;

}
