package com.stanzaliving.search.medulla.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoSearchRequetDto {
    private String searchText;
    private String userRole;
    private Department department;
    private Boolean po;
    private String deliveryLocationUuid;
    private String deliveryLocationType;
    private List<UIKeyValue> poStatus;
    private List<GenericPOType> poTypes;
    private String listingType;
    private PageAndSortDto pageDto;
    private String[] fieldsNeeded;
    private String sourceOrVendorUuid;
    private Double maxGsriPct;
    private Double minGsriPct;
}
