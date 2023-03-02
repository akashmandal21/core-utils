package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanOptInRequestDto {

    @Valid
    @NotBlank(message = "Plan uuid cannot be null or empty")
    private String planUuid;

    @Valid
    @NotNull(message = "Opt in date cannot be null")
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private Date optInDate;

    @Builder.Default
    private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

    @Valid
    @NotNull(message = "Lock in end-date cannot be null")
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private Date lockInEndDate;

    private VasCategory category;

    private String planName;

    private double vasPriceAmount;

}
