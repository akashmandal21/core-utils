package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;


@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddZoneDto {

    private String zoneUuid;
    private String zoneName;
    private UIKeyValue status;
    private List<UIKeyValue> stanzaCity;
    private List<UIKeyValue> statusOptions;
    private List<UIKeyValue> stanzaCityOptions;
}
