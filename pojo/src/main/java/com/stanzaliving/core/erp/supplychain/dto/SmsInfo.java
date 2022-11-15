package com.stanzaliving.core.erp.supplychain.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@ToString
public class SmsInfo {
    private String dltTemplateId;
    private String recepientType;
    private String message;
    public SmsInfo(String dltTemplateId, String recepientType, String message) {
        this.dltTemplateId = dltTemplateId;
        this.recepientType = recepientType;
        this.message = message;
    }
}
