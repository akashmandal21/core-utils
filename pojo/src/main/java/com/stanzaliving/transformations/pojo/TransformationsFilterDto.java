package com.stanzaliving.transformations.pojo;

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
    private List<String> stanzaCity;
    private List<String> stanzaCluster;
    private List<String> city;
    private SortDirection sortBy;
    private SortByKey sortKey;
    private String geographicalUuid;
}
