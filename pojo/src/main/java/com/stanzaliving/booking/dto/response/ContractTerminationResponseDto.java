package com.stanzaliving.booking.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.paymentPlan.dto.PaymentPlanAndLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractTerminationResponseDto {

    private List<CNForContractTerminationResponseDto> creditNoteList;
    private String securityDepositAvailable;
    private String advanceRentalAvailable;
    private String ledgerBalance;
    private String upcomingDues;
    private String totalPendingDues;
    private String totalRefundAmount;
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private LocalDate auditDate;
    private Double coinsToBeAdded;
}
