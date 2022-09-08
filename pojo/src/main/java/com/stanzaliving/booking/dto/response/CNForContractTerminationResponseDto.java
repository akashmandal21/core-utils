package com.stanzaliving.booking.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CNForContractTerminationResponseDto {
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private LocalDate fromDate;
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private LocalDate toDate;
    private String invoiceType;
    private String invoiceAmount;
    private String creditNoteAmount;
}
