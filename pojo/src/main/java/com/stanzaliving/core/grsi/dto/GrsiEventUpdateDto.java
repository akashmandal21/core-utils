package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.transformations.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrsiEventUpdateDto {

    private String grsiId;
    private String poToId;
    private LocationType locationType;
    private String addressUuid;
    private boolean po;

    List<GrsiItemDto> gsriItems;
}
