package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteAppliedFiltersDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean allControllerFiltersAreEmpty;

    private Integer cityId;
    private String cityName;
    private String mmName;
    private String urlTargetPlaceName;

    private List<Integer> mmIds;

    private List<Gender> genderIn;

    private Set<Integer> occupancyIds;

    private List<Integer> featureIdIn;

    private List<Integer> facilityIdIn;

    private Integer minPriceRange;

    private Integer maxPriceRange;

    private String residenceType;

    private List<Integer> roomCountIn;

    private boolean entireFlat;

    private Double latitude;
    private Double longitude;

    private String sortBy;

    private Integer pageNo;
    private Integer pageSize;
}
