package com.stanzaliving.core.commercialcode.dto;


import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.booking.enums.PaymentFrequency;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardRequestDto {

    @NotNull(message = "City uuid cannot be null")
    @NotEmpty(message = "City uuid required")
    private String cityUuid;

    @NotNull(message = "Micromarket uuid cannot be null")
    @NotEmpty(message = "Micromarket uuid required")
    private String micromarketUuid;

    @NotNull(message = "Residence uuid cannot be null")
    @NotEmpty(message = "Residence uuid required")
    private String residenceUuid;


    private String tenurePeriod;

    private String lockInPeriod;

    private String roomUuid;

    private List<String> roomUuidList;

    private CommercialCardUserType commercialCardUserType;

    private String serviceMixUuid;

    private String bookingUuid;

    private String moveInDate;

    @Builder.Default
    private Integer roomCount = 1;

    private BookingSubType bookingSubType;

    private PlatformType platform;

    private PaymentFrequency paymentFrequency;

    private String strategyUuid;
}
