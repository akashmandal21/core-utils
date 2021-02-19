package com.stanzaliving.core.po.generic.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PoSearchIndexDto {

    private String poToUuid;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    private Date endDate;
    private Date startDate;
    private Date approvedOn;
    private GenericPOTOStatus potoStatus;
    private GenericPOType poToType;
    private Department creatorDepartment;
    private boolean po;
    private String sourceOrVendorUuid;
    private String sourceOrVendorName;
    private String sourceOrVendorType;
    private String poLocType;
    private String deliveryLocationType;
    private String deliveryLocationName;
    private Double poAmount;
}
