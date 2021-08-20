package com.stanzaliving.core.po.generic.dtos;


import java.util.Date;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class PoSearchIndexDto extends AbstractSearchIndexDto{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
    private String poToNumberSearch;
    private String poDepartment;
    private Boolean visibleInGrn;
    private Double gsriPct;
}
