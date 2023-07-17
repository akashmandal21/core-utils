package com.stanzaliving.boq_service.dto;

import com.stanzaliving.boq_service.enums.BoqLabel;
import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.transformations.enums.BoqStatus;
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

    private BoqType boqTypeValue;

    private Long updatedOn;

    private String updatedBy;

    private Long createdOn;

    private String createdBy;

    private BigDecimal totalCapex;

    private BigDecimal boiCapex;

    private BigDecimal gcCapex;

    private BigDecimal otherCapex;

    private String statusText;

    private String boqStatus;

    private BoqStatus boqStatusValue;

    private String boqLabel;

    @Builder.Default
    private BoqLabel boqLabelValue = BoqLabel.NA;
    
    private String textColor;

    private String bgColor;

    private boolean isEditable;

    private boolean canApprove;

    private long commentCount;

    private Long approvedOn;

    private String approvedBy;
}
