package com.stanzaliving.core.venta_aggregation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResidenceListingFilterDto implements Serializable {
    private BedAttributesFilter bedAttributesFilter;
    private List<FilterListDto> gender;
    private List<FilterListDto> serviceMix;
    private List<FilterListDto> productMix;
    private List<FilterListDto> beds;
    private List<FilterListDto> price;
    private List<FilterListDto> status;
}
