package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenResponseDto extends UnderWrittenDto {

    private String underWrittenUuid;

    private String serviceMixUuid;

    private String residenceUuid;

    private UnderWrittenStatus currentStatus;               //get

    private UnderWrittenStatus finalStatus;     //post

    private LocalDate fromDate;

    private LocalDate toDate;

    private Integer roomCount;

    private Integer bedCount;

    private ResidenceBrand residenceBrand;

    private String seasonUuid;

    private String versionName;

    private Integer versionNumber;

    private String commentUuid;

    private String approvedCommentUuid;

    private ApprovalStatus approvalStatus;

    @Builder.Default
    protected List<LocalDate> holidays = new ArrayList<>();

    protected List<LocalDate> specialDays;

}
