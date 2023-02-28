package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicSeoTemplateVariablesDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mmName;
    private String mmDefaultAlias;
    private String nearbyMm1Name;
    private String nearbyMm2Name;
    private String nearbyMm1DefaultAlias;
    private String nearbyMm2DefaultAlias;
    private String top10NearbyHouseHyperlink;
    private String top3NearbyHouseHyperlink;
    private String neighbourhoodList;
    private String neighbourhoodPlace1;
    private String neighbourhoodPlace2;
    private String neighbourhoodPlace3;
    private String neighbourhoodPlace4;
    private String neighbourhoodListTop6;
}
