package com.stanzaliving.productmix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateStatus {
    IN_DRAFT("In Draft"),
    PENDING_APPROVAL("Pending Approval"),
    APPROVED("Approved"),
    REJECTED("Rejected");

    private final String label;

//    public LabelValueDto getLabelValueDTO (){
//        return new LabelValueDto(this.toString(), this.getLabel());
//    }
}
