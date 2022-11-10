package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {
    @NotBlank(message = "Address is mandatory")
    private String addressLine1;
    private String addressLine2;
}
