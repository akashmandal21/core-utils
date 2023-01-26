package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanOptOutRequestDto {
    @NotBlank(message = "Plan uuid cannot be null or empty")
    private String planUuid;

    @NotNull(message = "Opt in cannot be null")
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private Date optOutDate;

    @Builder.Default
    private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

    @Builder.Default
    private int lockIn = 1;

    private VasCategory category;
}
