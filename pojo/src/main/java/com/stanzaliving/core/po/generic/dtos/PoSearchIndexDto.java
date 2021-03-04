package com.stanzaliving.core.po.generic.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PoSearchIndexDto {
    private String uuid;
    private boolean status;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private Date endDate;
    private Date startDate;
    private Date approvedOn;
    private String approvedBy;
    private String poToNumber;
    private GenericPOTOStatus potoStatus;
    private GenericPOType poToType;
    private Department creatorDepartment;
    private boolean po;
    private String sourceOrVendorUuid;
    private String sourceOrVendorName;
    private String sourceOrVendorType;
    private String poLocType;
    private String deliveryLocationType;
    private String deliveyLocationUuid;
    private String deliveryLocationName;
    private Double poAmount;
    private String propertyUuid;
    private String poDocUrl;
    private String poToNumberSuggest;
    private String poToNumberKeyword;
}
