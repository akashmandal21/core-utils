package com.stanzaliving.designservice.request.dto;

import com.stanzaliving.designservice.enums.ApprovalActions;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoenixDesignStatusUpdateRequestDto {

    private ApprovalActions approvalAction;
    private PhoenixDesignStatus phoenixDesignStatus;

    private String propertyUuid;

    private String phoenixDesignRemark;

    private String reasonForNoSumma;

    private String reasonForNoMagna;

    private String reasonForNoPrima;

}
