package com.stanzaliving.boq_service.dto;

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
public class GlobalBoqListingDto {

    private String propertyUuid;

    private String propertyName;

    private String micromarketName;

    private String cityName;

    private Integer numberOfBeds;

    private Integer numberOfBoqs;

//    private BigDecimal totalBudget;

    private BigDecimal totalCapex;

//    private BigDecimal margin;

    private LabelValueDto<BoqStatus> boqStatus;

    private String textColor;

    private String bgColor;

    private boolean canApprove;

    private long commentCount;
}
