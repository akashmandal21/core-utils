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
    private boolean status;
    private String zoneUuid;
    private String stanzaCityUuid;
    private List<UIKeyValue> micromarkets;
}
