package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.dto.request.ServicePriceDto;
import com.stanzaliving.booking.dto.request.VasPriceDto;
import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.PaymentPlanType;
import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.booking.enums.ReferenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VasPaymentPlanRequestDTO extends PaymentPlanRequestDto implements Serializable {

    @NotEmpty(message = "referenceId cannot be null or blank")
    private String referenceId;

    @Builder.Default
    private ReferenceType referenceType = ReferenceType.BOOKING;

    @NotNull(message = "contractStartDate cannot be null")
    private Date contractStartDate;

    private Date subContract1EndDate;

    @NotNull(message = "contractEndDate cannot be null")
    private Date contractEndDate;

    private Date stayLockInDate;

    private BookingType bookingType;

    @Builder.Default
    private Integer startingAdvanceRentalMonths = 1;

    @Builder.Default
    private Integer lastAdvanceRentalMonths = 0;

    private List<ServicePriceDto> vasPriceDtos;

    @Builder.Default
    private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

    private Boolean isModifyContract = false;

    private Date modifiedContractStartDate;

    private Boolean isGenerateInvoice =false;

    private String residenceUuid;

    private String residentUuid;

    @Builder.Default
    private PaymentPlanType paymentPlanType = PaymentPlanType.VAS;

}
