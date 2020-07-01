package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlfredRazorPayRequestDto {
    @NotNull
    private String bookingUuid;
    @NotNull
    private String razorpayPaymentId;
    @NotNull
    private String razorpayOrderId;
    @NotNull
    private String razorpaySignature;

}
