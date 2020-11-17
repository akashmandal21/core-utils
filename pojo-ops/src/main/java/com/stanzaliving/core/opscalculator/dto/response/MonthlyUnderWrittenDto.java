package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.opscalculator.dto.UnderWrittenDto;
import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class  MonthlyUnderWrittenDto extends UnderWrittenDto {
    private int monthNumber;
    private int year;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String residenceUuid;
    private String monthlyUnderWrittenUuid;
    private String serviceMixUuid;
    private String muwServiceMixUuid;
    private UnderWrittenStatus currentStatus;
    private UnderWrittenStatus finalStatus;
    private String commentUuid;
    private Double deviation;
    private Integer bedCount;
    private Integer roomCount;
    private ApprovalStatus approvalStatus;

}
