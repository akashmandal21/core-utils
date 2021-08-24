package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalBoqListingRequestFilterDto {

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 20;

    @Builder.Default
    private String sortBy = "PropertyName";

    @Builder.Default
    private String sortOrder = "asc";

    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqStatus>> boqStatus;

    private List<LabelValueDto<ItemType>> capexType;

    private List<LabelValueDto<String>> city;

    private List<LabelValueDto<String>> micromarket;

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> approvedBy;

    private List<LabelValueDto<String>> lastUpdatedBy;

    private LocalDate createdFromDate;

    private LocalDate createdToDate;

    private LocalDate approvedFromDate;

    private LocalDate approvedToDate;
}
