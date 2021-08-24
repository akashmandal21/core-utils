package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingGroupByBoq {

    private String boqName;

    private String boqUuid;

    private String boqType;

    private Long updatedOn;

    private String updatedBy;

    private BigDecimal totalCapex;

    private BigDecimal boiCapex;

    private BigDecimal gcCapex;

    private BigDecimal otherCapex;

    private String statusText;

    private String boqStatus;

    private String textColor;

    private String bgColor;

    private boolean isEditable;

    private boolean canApprove;
}
