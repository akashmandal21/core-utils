package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.item_master.enums.SortDirection;
import com.stanzaliving.transformations.enums.SortByKey;
import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 19/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransformationsFilterDto {
    private List<UIKeyValue> stanzaCity;
    private List<UIKeyValue> stanzaCluster;
    private List<UIKeyValue> zone;
    private List<UIKeyValue> city;
    private SortDirection sortBy;
    private SortByKey sortKey;
    private String geographicalUuid;
    private String stanzaCityUuid;
    private UIKeyValue zoneUuid;
    private Boolean status;
    

}
