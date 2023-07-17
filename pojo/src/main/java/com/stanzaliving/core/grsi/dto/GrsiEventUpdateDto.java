package com.stanzaliving.core.grsi.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.transformations.enums.LocationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GrsiEventUpdateDto {

    private String grsiId;
    private String poToId;
    private String poNumber;
    private GenericPOType poType;
    private LocationType targetLocationType;
    private String targetAddressUuid;
    private LocationType srcLocationType;
    private String srcAddressUuid;
    private boolean po;
    private String doneBy;
    private Date doneAt;
    private GrsiItemDto gsriItem;
    private String adjustCloseId;
    private Integer version;
    private Department poToDepartment;

}
