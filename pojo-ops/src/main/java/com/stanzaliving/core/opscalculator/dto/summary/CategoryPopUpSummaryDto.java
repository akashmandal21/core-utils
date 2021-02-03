package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategoryPopUpSummaryDto {
    String annualUnderWrittenUuid;
    String monthlyUnderWrittenUuid;
    String residenceUuid;
    boolean monthPartiallyCovered;
    Integer costPerAvailableBedPerMonth;
    List<CategoryPopUpSummaryDetailsDto> categoryPopUpSummaryDetailsDtoList;

    private UnderWrittenStatus underWrittenStatus;
    private String pendingApprovalFrom;
    private String approvalStatus;
    private String bgColorCode;
    private String textColorCode;
}
