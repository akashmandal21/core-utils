package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalListingFilterOptionsDto {

    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqStatus>> boqStatus;

    private List<LabelValueDto<ItemType>> capexType;

    private List<LabelValueDto<String>> city;

//    private List<LabelValueDto<String>> micromarket; city -> mm at FE

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> approvedBy; //todo: how??

    private List<LabelValueDto<String>> lastUpdatedBy;
}
