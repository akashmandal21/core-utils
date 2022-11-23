package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 30/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkUpdateStanzaCluster {
    List<UpdateStanzaCityInStanzaCluster> rows;
    List<UIKeyValue> stanzaCityOptions;
    List<UIKeyValue> zoneOptions;
    UIKeyValue stanzaCity;
    UIKeyValue zone;
}


