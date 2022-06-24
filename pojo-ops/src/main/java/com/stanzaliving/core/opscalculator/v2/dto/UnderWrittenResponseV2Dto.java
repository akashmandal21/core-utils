package com.stanzaliving.core.opscalculator.V2.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import com.stanzaliving.core.sqljpa.conveter.LocalDateAttributeConverter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenResponseV2Dto extends UnderWrittenV2Dto {

    private String underWrittenUuid;

    private String serviceMixUuid;

    private String residenceUuid;

    private UnderWrittenStatus currentStatus;              

    private UnderWrittenStatus finalStatus;     

    private LocalDate fromDate;

    private LocalDate toDate;    

    private LocalDate plannedHOTODate;

    private LocalDate actualHotoDate;

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
    
    private NucleusRateMasterDto nucleusRateMasterDto;
    
}
