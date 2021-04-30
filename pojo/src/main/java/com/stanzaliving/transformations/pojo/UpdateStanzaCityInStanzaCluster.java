package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

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
public class UpdateStanzaCityInStanzaCluster {
    private UIKeyValue stanzaCluster;
    private UIKeyValue currentZone;
    private UIKeyValue currentStanzaCity;

}
