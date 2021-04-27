package com.stanzaliving.transformations.pojo;

import lombok.*;

/**
 * @author dhruv.mathur
 * @date 16/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransformationsListingDto {
    private String uuid;
    private String zoneName;

    private String geographicalClusterName;
    private DescriptiveDto geographicalCluster;

    private String stanzaClusterName;
    private DescriptiveDto stanzaCluster;

    private String geographicalCityName;
    private DescriptiveDto geographicalCity;

    private String stanzaCityName;
    private DescriptiveDto stanzaCity;

    private DescriptiveDto residences;

    private UpdatedByDto lastUpdated;
    private Boolean enabled;

    private String textColor;
    private String backgroundColor;




}
