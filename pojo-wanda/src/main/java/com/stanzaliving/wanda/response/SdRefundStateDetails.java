package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.SdRefundStatus;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SdRefundStateDetails {

    private SdRefundStatus status;
    private String info;
    private String errorMessage;
    private boolean bankDetailsAvailable;
    private String upiId;
}
