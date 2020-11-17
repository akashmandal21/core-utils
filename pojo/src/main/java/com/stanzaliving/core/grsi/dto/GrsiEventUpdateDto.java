package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.transformations.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrsiEventUpdateDto {

    private String grsiId;
    private String poToId;
    private LocationType targetLocationType;
    private String targetAddressUuid;
    private LocationType srcLocationType;
    private String srcAddressUuid;
    private boolean po;
    private String doneBy;
    private Date doneAt;
    private GrsiItemDto gsriItem;
}
