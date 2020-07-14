package com.stanzaliving.collector.dto.response;


import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RentSummaryResponseDto {
    FeElementDto payable;
    FeElementDto pending;
    FeElementDto arrears;
    FeElementDto totalPending;
    String payableMsg;
    String pendingMsg;
    String arrearsMsg;
    String totalPendingMsg;
}
