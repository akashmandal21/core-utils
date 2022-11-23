package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 15/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddStanzaClusterDto {
    private String stanzaClusterName;
    private UIKeyValue status;
    private UIKeyValue zone;
    private UIKeyValue stanzaCity;
    private List<UIKeyValue> micromarkets;
    private List<UIKeyValue> geographicalCities;

    private List<UIKeyValue> statusOptions;
    private List<UIKeyValue> zoneOptions;
    private List<UIKeyValue> geographicalCityOptions;
    private List<UIKeyValue> stanzaCityOptions;
    private List<UIKeyValue> geographicalClusterOptions;


}
